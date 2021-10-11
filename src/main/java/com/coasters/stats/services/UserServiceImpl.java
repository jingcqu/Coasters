package com.coasters.stats.services;

import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 05/10/2021
 */

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public Mono<UserDTO> getUserDTOById(UUID id) {
        return null;
    }

    @Override
    public Mono<UserDTO> getUserDTOByName(String name) {
        return null;
    }

    @Override
    public Mono<UserDTO> createUser(UserDTO userDTO) {
        return null;
    }
}
