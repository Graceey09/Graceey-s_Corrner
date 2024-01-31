package com.gracescorrner.demo.service;

import com.gracescorrner.demo.data.models.Post;
import com.gracescorrner.demo.data.models.User;
import com.gracescorrner.demo.data.repository.PostRepository;
import com.gracescorrner.demo.dtos.requests.*;
import com.gracescorrner.demo.exceptions.NoSuchThingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserServiceImpl userService;


    @Override
    public Post deletePost(DeletePostRequest deletePostRequest) {
        FindPostRequest findPostRequest = new FindPostRequest();
        findPostRequest.setPostedBy(deletePostRequest.getPostedBy());
        Post foundPost = findPost(findPostRequest);
        postRepository.delete(foundPost);
        return foundPost;

    }

    @Override
    public Post createPost(CreatePostRequest createPostRequest) {
        User user = userService.findByUsername(createPostRequest.getUsername());
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        post.setPostedBy(user);
        return postRepository.save(post);

    }

    @Override
    public Post findPost(FindPostRequest findPostRequest) {
        Optional<Post> foundPost = postRepository.findByPostedBy(findPostRequest.getPostedBy());
        if (foundPost.isPresent()){
            return foundPost.get();

        }else {
            throw new NoSuchThingException("Post not found");

        }
    }


    @Override
    public Optional<Post> findPostById(FindPostByIdRequest findPostByIdRequest) {
        return postRepository.findById(findPostByIdRequest.getId());
    }

    public Optional<Post> findAllPost(User user) {
        return postRepository.findByPostedBy(user);
    }
}

