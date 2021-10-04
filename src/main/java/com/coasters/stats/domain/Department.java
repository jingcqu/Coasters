package com.coasters.stats.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Document
public class Department {
    @Id
    private UUID id;
    private String name;
    private String description;
    private College college;
    private Set<Course> courses = new HashSet<>();
}
