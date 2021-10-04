package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseGroupDTO {
    private String id;
    private CourseDTO course;
    private String section;
    private ProfessorDTO professor;
    private Set<CourseTermDTO> courseTerms;
}
