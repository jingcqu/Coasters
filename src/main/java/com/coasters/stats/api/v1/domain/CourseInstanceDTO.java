package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseInstanceDTO {
    private UUID id;
    private GradingThresholdsDTO gradingThresholds;
    private CourseTermDTO courseTerm;
}
