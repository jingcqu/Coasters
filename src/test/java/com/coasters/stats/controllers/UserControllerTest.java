package com.coasters.stats.controllers;

import com.coasters.stats.repository.UserRepository;
import com.coasters.stats.services.UserService;
import com.coasters.stats.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    WebTestClient webTestClient;
    UserRepository userRepository;
    UserService userService;
    UserController userController;

    @BeforeEach
    public void setUp() {
        userRepository = Mockito.mock(UserRepository.class);
        userService = new UserServiceImpl(userRepository);
        userController = new UserController(userService);
    }

    @Test
    public void getUserByIdTest(){

    }

    @Test
    public void createUserTest(){

    }
}