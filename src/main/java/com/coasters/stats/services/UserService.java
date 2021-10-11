package com.coasters.stats.services;

import com.coasters.stats.api.v1.domain.UserDTO;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 29/09/2021
 */
public interface UserService {
    Mono<UserDTO> getUserDTOById(UUID id);
    Mono<UserDTO> getUserDTOByName(String name);
    Mono<UserDTO> createUser(UserDTO userDTO);
}
