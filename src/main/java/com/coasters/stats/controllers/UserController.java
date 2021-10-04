package com.coasters.stats.controllers;

import com.coasters.stats.api.v1.domain.CourseGroupDTO;
import com.coasters.stats.api.v1.domain.CourseTermDTO;
import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.services.UserService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @GetMapping("/{userId}")
    public Mono<UserDTO> getUserById(@PathVariable("userId") UUID userId){
        return userService.getUserDTOById(userId);
    }


    @PostMapping("/create")
    public Mono<UserDTO> createUser(UserDTO userDTO){  //todo: update param
        return userService.createUser(userDTO); //todo: pass post stream to function
    }
}
