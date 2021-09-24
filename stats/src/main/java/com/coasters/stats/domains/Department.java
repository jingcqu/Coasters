package com.coasters.stats.domains;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Department {
    @Id
    private String id;
    private String name;
    private String description;
    private College college;
}