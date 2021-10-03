package com.coasters.stats.api.v1.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * author: jingcqu
 * on: 24/09/2021
 */

@Data
public class CourseTermDTO {
    private String id;
    private String description; //fall, spring, winter, summer, summer 1, etc
    private String year; //Example: academic year in form of 21-22
    private CourseGroupDTO courseGroup;
}
