package com.coasters.stats.api.v1.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Set;
import java.util.UUID;

@Data
public class CourseGroupDTO {
    private String id;
    private CourseDTO course;
    private String section;
    private Professor professor;
    private Set<CourseTermDTO> courseTerms;
}
