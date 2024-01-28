package com.gracescorrner.demo.dtos.requests;

import lombok.Data;

@Data
public class DeletePostRequest {
    private String username;
    private String title;
}
