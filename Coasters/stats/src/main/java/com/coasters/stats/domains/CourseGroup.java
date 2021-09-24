package com.coasters.stats.domains;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CourseGroup {
    @Id
    private String id;
    private Course course;
    private String section;
    private Professor professor;
}
