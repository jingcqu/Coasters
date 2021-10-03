package com.coasters.stats.api.v1.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class CourseDTO {
    private String id;
    private String universityCourseNumber;
    private String name;
    private String description;
    private Department department;
}
