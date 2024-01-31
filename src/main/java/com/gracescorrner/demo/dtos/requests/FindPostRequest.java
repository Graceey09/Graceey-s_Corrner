package com.gracescorrner.demo.dtos.requests;

import com.gracescorrner.demo.data.models.User;
import lombok.Data;

import java.util.List;

@Data
public class FindPostRequest {
    private User postedBy;
    private String title;
}
