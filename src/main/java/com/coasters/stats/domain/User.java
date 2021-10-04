package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
import java.util.UUID;

@Data
@Document
public class User {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String classification; //may need new name for this member means freshman/sophomore/junior/senior, etc
    private School school;
    private Set<CourseInstance> courseInstances; //todo: really need to draw out an uml diagram: should separate CourseInstances per term for student
}
