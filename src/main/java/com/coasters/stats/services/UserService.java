package com.coasters.stats.services;

import com.coasters.stats.api.v1.domain.SchoolDTO;
import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.domain.School;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 29/09/2021
 */
public interface UserService {
    Mono<UserDTO> getUserDTOById(UUID id);
    Mono<UserDTO> createUser(UserDTO userDTO);
    Mono<UserDTO> addSchool(UUID uuid, SchoolDTO schoolDTO);
    Mono<UserDTO> removeSchool(UUID uuid, SchoolDTO schoolDTO);
}
