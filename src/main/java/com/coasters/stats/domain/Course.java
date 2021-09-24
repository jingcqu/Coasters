package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
public class Course {
    @Id
    private String id = UUID.randomUUID().toString();
    private String universityCourseNumber;
    private String name;
    private String description;
    private Department department;
}
