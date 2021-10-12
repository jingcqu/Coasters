package com.coasters.stats.controllers;

import com.coasters.stats.api.v1.convertter.SchoolDTOToSchool;
import com.coasters.stats.api.v1.convertter.UserDTOToUser;
import com.coasters.stats.api.v1.convertter.UserToUserDTO;
import com.coasters.stats.repository.SchoolRepository;
import com.coasters.stats.repository.UserRepository;
import com.coasters.stats.services.UserService;
import com.coasters.stats.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.web.reactive.server.WebTestClient;

class UserControllerTest {
    WebTestClient webTestClient;
    UserRepository userRepository;
    SchoolRepository schoolRepository;
    UserService userService;
    UserController userController;

    @BeforeEach
    public void setUp() {
        userRepository = Mockito.mock(UserRepository.class);
        schoolRepository = Mockito.mock(SchoolRepository.class);
        userService = new UserServiceImpl(userRepository, schoolRepository, new UserToUserDTO(), new UserDTOToUser(), new SchoolDTOToSchool());
        userController = new UserController(userService);
    }

    @Test
    public void getUserByIdTest(){

    }

    @Test
    public void createUserTest(){

    }
}