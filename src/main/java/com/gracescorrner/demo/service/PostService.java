package com.gracescorrner.demo.service;

import com.gracescorrner.demo.data.models.Post;
import com.gracescorrner.demo.dtos.requests.CreatePostRequest;
import com.gracescorrner.demo.dtos.requests.DeletePostRequest;
import com.gracescorrner.demo.dtos.requests.FindPostByIdRequest;
import com.gracescorrner.demo.dtos.requests.FindPostRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PostService {

    Post deletePost(DeletePostRequest deletePostRequest);

    Post createPost(CreatePostRequest createPostRequest);

    Post findPost(FindPostRequest findPostRequest);

//    Post findPost(User username, String title);
    Optional<Post> findPostById(FindPostByIdRequest id);

    List<Post> findAllPost(String username);
}
