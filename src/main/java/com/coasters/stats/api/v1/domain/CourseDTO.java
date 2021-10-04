package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private UUID id;
    private String universityCourseNumber;
    private String name;
    private String description;
    private DepartmentDTO department;
}
