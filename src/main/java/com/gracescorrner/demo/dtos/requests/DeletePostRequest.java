package com.gracescorrner.demo.dtos.requests;

import com.gracescorrner.demo.data.models.User;
import lombok.Data;

@Data
public class DeletePostRequest {
    private User postedBy;
    private String title;
}
