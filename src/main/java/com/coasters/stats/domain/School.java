package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
import java.util.UUID;


@Data
@Document
public class School {
    @Id
    private UUID id;
    private Address address;
    private String name;
    private String description;
    private Set<College> colleges;
}
