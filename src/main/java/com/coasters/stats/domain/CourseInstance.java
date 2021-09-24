package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CourseInstance {
    @Id
    private String id;
    private GradingThresholds gradingThresholds;
    private CourseTerm courseTerm;
}
