package com.coasters.stats.api.v1.convertter;

import com.coasters.stats.api.v1.domain.UserDTO;
import com.coasters.stats.domain.User;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * author: jingcqu
 * on: 11/10/2021
 */

@Component
public class UserToUserDTO implements Converter<User,UserDTO> {
    @Synchronized
    @Nullable
    @Override
    public UserDTO convert(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId()); //todo: maybe not set the id?? idk
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setStudentClass(user.getStudentClass());
        userDTO.setStudentLevel(user.getStudentLevel());
        return userDTO;
    }
}
