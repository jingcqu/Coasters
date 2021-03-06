package com.coasters.stats.controllers;

import com.coasters.stats.api.v1.domain.CourseGroupDTO;
import com.coasters.stats.api.v1.domain.CourseTermDTO;
import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/{userId}")
    public Mono<UserDTO> getUserById(@PathVariable("userId") UUID userId){ //todo: write tests before further implementation
        return userService.getUserDTOById(userId);
    }

    @PostMapping("/create")
    public Mono<UserDTO> createUser(UserDTO userDTO){  //todo: update param and write tests before further implementation
        return userService.createUser(userDTO); //todo: pass post stream to function
    }
}
