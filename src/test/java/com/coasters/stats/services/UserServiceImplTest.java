package com.coasters.stats.services;

import com.coasters.stats.domain.GradClass;
import com.coasters.stats.domain.StudentLevel;
import com.coasters.stats.domain.UndergradClass;
import com.coasters.stats.domain.User;
import com.coasters.stats.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp(){
        userRepository.deleteAll();
    }

    @Test
    void getUserDTOById() {
        User user1 = new User("Shrek", "Green", UndergradClass.SENIOR, StudentLevel.UNDERGRADUATE);
        User user2 = new User("Peter", "Parker", UndergradClass.FRESHMAN, StudentLevel.UNDERGRADUATE);
        User user3 = new User("Steven", "Strange", GradClass.YEAR_3, StudentLevel.GRADUATE);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

    }

    @Test
    void createUser() {
    }
}