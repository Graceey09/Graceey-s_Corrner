package com.gracescorrner.demo.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.w3c.dom.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
