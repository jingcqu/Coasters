package com.coasters.stats.api.v1.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CourseInstanceDTO {
    private String id;
    private GradingThresholds gradingThresholds;
    private CourseTermDTO courseTerm;
}
