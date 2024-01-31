package com.gracescorrner.demo.cotroller;

import com.gracescorrner.demo.data.models.Post;
import com.gracescorrner.demo.data.models.User;
import com.gracescorrner.demo.data.repository.UserRepository;
import com.gracescorrner.demo.dtos.requests.CreatePostRequest;
import com.gracescorrner.demo.dtos.requests.RegisterUserRequest;
import com.gracescorrner.demo.dtos.responses.RegisterUserResponse;
import com.gracescorrner.demo.exceptions.UserException;
import com.gracescorrner.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;
    private final UserRepository userRepository;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        return userService.registerWith(registerUserRequest);
    }


    @GetMapping("/find-by-username/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }
}

