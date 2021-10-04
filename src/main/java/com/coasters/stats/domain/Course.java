package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
/**
 * author: jingcqu
 * on: 24/09/2021
 */
@Data
public class Course {
    @Id
    private UUID id;
    private String universityCourseNumber;
    private String name;
    private String description;
    private Department department;
}
