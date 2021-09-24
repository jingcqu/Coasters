package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;


@Data
@Document
public class School {
    @Id
    private String id;
    private Address address;
    private String name;
    private String description;
    private Set<College> colleges;
}
