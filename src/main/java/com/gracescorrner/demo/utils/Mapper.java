package com.gracescorrner.demo.utils;

import com.gracescorrner.demo.data.models.User;
import com.gracescorrner.demo.data.repository.UserRepository;
import com.gracescorrner.demo.dtos.requests.RegisterUserRequest;
import com.gracescorrner.demo.dtos.responses.RegisterUserResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mapper {
    public static User map(RegisterUserRequest registerUserRequest) {
        User user = new User();
        user.setUsername(registerUserRequest.getUsername());
        user.setPassword(registerUserRequest.getPassword());
        return user;
    }
    public static RegisterUserResponse map(User user){
        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setUsername(user.getUsername());
        registerUserResponse.setRegisterDate(DateTimeFormatter
                .ofPattern("EEE dd/MMM/yyyy HH:mm:ss a")
                .format(LocalDateTime.now()));
        return registerUserResponse;
    }
}
