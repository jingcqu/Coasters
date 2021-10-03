package com.coasters.stats.api.v1.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@Document
public class Department {
    @Id
    private String id;
    private String name;
    private String description;
    private College college;
    private Set<Course> courses = new HashSet<>();
}
