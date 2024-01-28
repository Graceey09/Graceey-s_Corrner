package com.gracescorrner.demo.dtos.responses;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
public class RegisterUserResponse {
    private String username;
    @CreatedDate
    @LastModifiedDate
    private String registerDate;
}
