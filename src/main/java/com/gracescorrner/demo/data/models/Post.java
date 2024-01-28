package com.gracescorrner.demo.data.models;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.w3c.dom.Comment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document("Post")
@ToString
public class Post {
    @Id
    private String id;
    @CreatedDate
    @LastModifiedDate
    private LocalDateTime createdAt;

    private String title;

    private String body;

    private Comment comment;

    private User postedBy;
}
