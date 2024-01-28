package com.gracescorrner.demo.data.repository;

import com.gracescorrner.demo.data.models.Post;
import com.gracescorrner.demo.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PostRepository extends MongoRepository<Post, String> {
    Optional<Post> findPostById(String id);

    Optional<Post> findByPostedBy(User postedBy);
}
