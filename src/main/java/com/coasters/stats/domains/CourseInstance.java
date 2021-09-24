package com.coasters.stats.domains;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CourseInstance {
    @Id
    private String id;
    private CourseGroup courseGroup;
    private GradingThresholds gradingThresholds;
}
