package com.coasters.stats.repository;

import com.coasters.stats.domain.StudentLevel;
import com.coasters.stats.domain.UndergradClass;
import com.coasters.stats.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@DataMongoTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Before
    public void setUp(){
        userRepository.deleteAll().block();
    }

    @Test
    public void testFindById(){
        User user1 = new User("Shrek", "Green", UndergradClass.SENIOR, StudentLevel.UNDERGRADUATE);
        UUID id1 = user1.getId();
        userRepository.save(user1).block();
        log.debug("Running UserService test - Id is :" + id1.toString());
        Long count = userRepository.count().block();
        assertEquals(Long.valueOf(1L), count);
    }
}