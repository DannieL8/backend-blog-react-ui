package com.api.blog.models;

import com.api.blog.controllers.UserController;
import com.api.blog.dto.UserPostsDTO;
import com.api.blog.repositories.UserJpaRepository;
import com.api.blog.services.UserPostsMapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

    @LocalServerPort
    private int port;

    @Autowired
    private UserJpaRepository repository;

    @Autowired
    private UserController uc;

    @Autowired
    private TestRestTemplate restTemplate;


    @Autowired
    private UserPostsMapService service;

    @Test
    public void getUsers() throws Exception{
    List<User> users = uc.getUsers("");

    assertTrue(users.size() > 0);
    }


    @Test
    public void getOneUser() throws  Exception {

        assertThat(restTemplate.getForObject("http://localhost:" + port +"/users/1" , User.class)).isNotNull();
    }
}
