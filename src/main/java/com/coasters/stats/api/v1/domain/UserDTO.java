package com.coasters.stats.api.v1.domain;

import com.coasters.stats.domain.StudentLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private Enum studentClass;
    private StudentLevel studentLevel;

    public UserDTO(String firstName, String lastName, Enum studentClass, StudentLevel studentLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentClass = studentClass;
        this.studentLevel = studentLevel;
    }
    //private String classification; //may need new name for this member means freshman/sophomore/junior/senior, etc
    //private SchoolDTO school;
    //private Set<CourseInstance> courseInstances; //todo: really need to draw out an uml diagram: should separate CourseInstances per term for student
}
