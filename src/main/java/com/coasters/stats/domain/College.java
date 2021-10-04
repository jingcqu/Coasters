package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;
import java.util.UUID;

/**
 * author: jingcqu
 * on: 24/09/2021
 */
@Data
public class College {
    @Id
    private UUID id;
    private String name;
    private String description;
    private Set<Department> departments;
}
