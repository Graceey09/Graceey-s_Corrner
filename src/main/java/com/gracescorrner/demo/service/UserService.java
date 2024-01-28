package com.gracescorrner.demo.service;

import com.gracescorrner.demo.data.models.Post;
import com.gracescorrner.demo.data.models.User;
import com.gracescorrner.demo.dtos.requests.CreatePostRequest;
import com.gracescorrner.demo.dtos.requests.RegisterUserRequest;
import com.gracescorrner.demo.dtos.responses.RegisterUserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String registerWith(RegisterUserRequest registerUserRequest);

    Post createPost(CreatePostRequest post);

    User findByUsername(String username);

}
