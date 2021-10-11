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
public class UserDTOToUser implements Converter<UserDTO, User>  {
    @Synchronized
    @Nullable
    @Override
    public User convert(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId()); //todo: maybe not set the id?? idk
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setStudentClass(userDTO.getStudentClass());
        user.setStudentLevel(userDTO.getStudentLevel());
        return user;
    }
}
