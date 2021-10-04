package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 24/09/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseTermDTO {
    private UUID id;
    private String description; //fall, spring, winter, summer, summer 1, etc
    private String year; //Example: academic year in form of 21-22
    private CourseGroupDTO courseGroup;
}
