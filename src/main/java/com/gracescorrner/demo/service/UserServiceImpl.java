package com.gracescorrner.demo.service;

import com.gracescorrner.demo.data.models.Post;
import com.gracescorrner.demo.data.models.User;
import com.gracescorrner.demo.data.repository.UserRepository;
import com.gracescorrner.demo.dtos.requests.CreatePostRequest;
import com.gracescorrner.demo.dtos.requests.RegisterUserRequest;
import com.gracescorrner.demo.exceptions.UserException;
import com.mongodb.DuplicateKeyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.gracescorrner.demo.utils.Mapper.map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostService postService;
    @Override
    public String registerWith(RegisterUserRequest registerUserRequest) {
        try {
            map(userRepository.save(map(registerUserRequest)));
            return "Registered successfully";
        }catch (DuplicateKeyException e){
            return "Username already taken";
        }
    }

    @Override
    public Post createPost(CreatePostRequest createPostRequest) {
        findByUsername(createPostRequest.getUsername());
        return postService.createPost(createPostRequest);
    }

    @Override
    public User findByUsername(String username) {
        Optional<User> foundUser = userRepository.findByUsername(username);
        if(foundUser.isPresent())
            return foundUser.get();
        else {
            throw new UserException("User doesn't exist");
        }
    }
}
