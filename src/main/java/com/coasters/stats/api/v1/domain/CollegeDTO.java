package com.coasters.stats.api.v1.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
public class CollegeDTO {
    private String id;
    private String name;
    private String description;
}
