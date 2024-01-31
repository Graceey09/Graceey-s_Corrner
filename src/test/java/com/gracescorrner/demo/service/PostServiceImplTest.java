package com.gracescorrner.demo.service;

import com.gracescorrner.demo.data.repository.PostRepository;
import com.gracescorrner.demo.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PostServiceImplTest {
    @Autowired
    private  PostService postService;
    @Autowired
    private UserService userService;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    public void reset(){
        postRepository.deleteAll();
        userRepository.deleteAll();
    }
    @Test
    public void testThatUserCanRegister(){
        assertThat(postRepository.count(),is(0L));
    }


}