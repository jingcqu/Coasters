package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
public class College {
    @Id
    private String id;
    private String name;
    private String description;
    private Set<Department> departments;
}
