package com.coasters.stats.bootstrap;

import com.coasters.stats.domain.User;
import com.coasters.stats.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * author: jingcqu
 * on: 10/10/2021
 */

@Slf4j
@Component
public class CoasterBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private final UserRepository userRepository;

    public CoasterBootStrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadUsers();
    }

    private void loadUsers(){
        User user1 = new User("Shrek", "Green", "Junior");
    }

}
