package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
import java.util.UUID;

@Data
public class CourseGroup {
    @Id
    private String id = UUID.randomUUID().toString();
    private Course course;
    @Indexed(unique = true)
    private String section;
    private Professor professor;
    private Set<CourseTerm> courseTerms;
}
