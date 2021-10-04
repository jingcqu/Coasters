package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String classification; //may need new name for this member means freshman/sophomore/junior/senior, etc
    //private SchoolDTO school;
    //private Set<CourseInstance> courseInstances; //todo: really need to draw out an uml diagram: should separate CourseInstances per term for student
}
