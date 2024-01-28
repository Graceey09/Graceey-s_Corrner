package com.gracescorrner.demo.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Comment {
    @Id
    private String id;
    private String body;
    private String dateCreated;
}
