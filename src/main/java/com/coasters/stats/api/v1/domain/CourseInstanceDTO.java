package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseInstanceDTO {
    private String id;
    private GradingThresholdsDTO gradingThresholds;
    private CourseTermDTO courseTerm;
}
