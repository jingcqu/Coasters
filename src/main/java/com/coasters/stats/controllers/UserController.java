package com.coasters.stats.controllers;

import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
