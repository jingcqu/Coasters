package com.coasters.stats.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Document
@NoArgsConstructor
public class User {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private Enum studentClass;
    private StudentLevel studentLevel;
    private Set<School> schools = new HashSet<>();
    private Set<CourseInstance> courseInstances = new HashSet<>(); //todo: really need to draw out an uml diagram: should separate CourseInstances per term for student

    public User(String firstName, String lastName, Enum studentClass, StudentLevel studentLevel) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentClass = studentClass;
        this.studentLevel = studentLevel;
    }

    public User addCourseInstance(CourseInstance courseInstance){
        this.courseInstances.add(courseInstance);
        return this;
    }

    public User addSchool(School school){
        this.schools.add(school);
        return this;
    }

    public User removeSchool(School school){
        schools.remove(school);
        return this;
    }
}
