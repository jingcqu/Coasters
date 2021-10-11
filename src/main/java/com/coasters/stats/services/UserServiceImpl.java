package com.coasters.stats.services;

import com.coasters.stats.api.v1.convertter.UserDTOToUser;
import com.coasters.stats.api.v1.convertter.UserToUserDTO;
import com.coasters.stats.api.v1.domain.SchoolDTO;
import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.domain.User;
import com.coasters.stats.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.UUID;

/**
 * author: jingcqu
 * on: 05/10/2021
 */

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserToUserDTO userToUserDTO;
    private UserDTOToUser userDTOToUser;

    @Override
    public Mono<UserDTO> getUserDTOById(UUID id) {
        return userRepository.findById(id).map(userToUserDTO::convert);
    }

    @Override
    public Mono<UserDTO> createUser(UserDTO userDTO) {
        return userRepository.save(Objects.requireNonNull(userDTOToUser.convert(userDTO))).map(userToUserDTO::convert);
    }

    @Override
    public Mono<UserDTO> updateUserSchool(UUID userId, SchoolDTO school) {
        return null;
    }

    @Override
    public Mono<UserDTO> addSchool(UUID uuid, SchoolDTO schoolDTO) {
        return null;
    }

    @Override
    public Mono<UserDTO> removeSchool(UUID uuid, SchoolDTO schoolDTO) {
        return null;
    }

}
