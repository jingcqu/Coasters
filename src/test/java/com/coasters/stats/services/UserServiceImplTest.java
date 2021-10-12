package com.coasters.stats.services;

import com.coasters.stats.api.v1.convertter.SchoolDTOToSchool;
import com.coasters.stats.api.v1.convertter.UserDTOToUser;
import com.coasters.stats.api.v1.convertter.UserToUserDTO;
import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.domain.GradClass;
import com.coasters.stats.domain.StudentLevel;
import com.coasters.stats.domain.UndergradClass;
import com.coasters.stats.domain.User;
import com.coasters.stats.repository.SchoolRepository;
import com.coasters.stats.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static reactor.core.publisher.Mono.when;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
class UserServiceImplTest {

    UserService userService;
    @Mock
    UserRepository userRepository;
    @Mock
    SchoolRepository schoolRepository;

    UserToUserDTO userToUserDTO;
    UserDTOToUser userDTOToUser;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        this.userDTOToUser = new UserDTOToUser();
        this.userToUserDTO = new UserToUserDTO();
        userService = new UserServiceImpl(userRepository, schoolRepository, userToUserDTO, userDTOToUser, new SchoolDTOToSchool());
    }


    @Test
    void getUserDTOById() {
        User user = new User();
        Mockito.when(userRepository.findById(any(UUID.class))).thenReturn(Mono.just(user));
        UserDTO userDTO = userService.getUserDTOById(UUID.randomUUID()).blockOptional().get();
        assertNotNull(userDTO);
    }

    @Test
    void createUser() {

    }
}