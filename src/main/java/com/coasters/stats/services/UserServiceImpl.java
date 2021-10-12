package com.coasters.stats.services;

import com.coasters.stats.api.v1.convertter.SchoolDTOToSchool;
import com.coasters.stats.api.v1.convertter.UserDTOToUser;
import com.coasters.stats.api.v1.convertter.UserToUserDTO;
import com.coasters.stats.api.v1.domain.SchoolDTO;
import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.domain.School;
import com.coasters.stats.domain.User;
import com.coasters.stats.repository.SchoolRepository;
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
    private SchoolRepository schoolRepository;

    private UserToUserDTO userToUserDTO;
    private UserDTOToUser userDTOToUser;
    private SchoolDTOToSchool schoolDTOToSchool;

    @Override
    public Mono<UserDTO> getUserDTOById(UUID id) {
        return userRepository.findById(id).map(userToUserDTO::convert);
    }

    @Override
    public Mono<UserDTO> createUser(UserDTO userDTO) {
        return userRepository.save(Objects.requireNonNull(userDTOToUser.convert(userDTO))).map(userToUserDTO::convert);
    }

    @Override
    public Mono<UserDTO> addSchool(UUID userId, SchoolDTO schoolDTO) {
        //todo add check to see if the user already has the school in the set
        User user = userRepository.findById(userId).block();
        assert user != null;
        User savedUser = null;
        School school = null;
        if (Boolean.TRUE.equals(schoolRepository.findByName(schoolDTO.getName()).hasElement().block())){
            school = schoolDTOToSchool.convert(schoolDTO);
            assert school != null;
            schoolRepository.save(school).block();
            savedUser = user.addSchool(school);

        }
        else {
            savedUser = user.addSchool(schoolDTOToSchool.convert(schoolDTO));
        }
        return Mono.just(Objects.requireNonNull(userToUserDTO.convert(savedUser)));
    }

    @Override
    public Mono<UserDTO> removeSchool(UUID uuid, SchoolDTO schoolDTO) {
        return null;
    }

}
