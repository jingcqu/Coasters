package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 24/09/2021
 */

@Data
public class CourseTerm {
    @Id
    private UUID id;
    private String description; //fall, spring, winter, summer, summer 1, etc
    private String year; //Example: academic year in form of 21-22
    private CourseGroup courseGroup;
}
