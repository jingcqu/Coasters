package com.coasters.stats.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
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

    public School() {
        id = UUID.randomUUID();
    }

    public School(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    public School addCollege(College college){
        colleges.add(college);
        return this;
    }
}
