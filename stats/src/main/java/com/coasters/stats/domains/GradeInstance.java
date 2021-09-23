package com.coasters.stats.domains;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class GradeInstance {
    @Id
    private String id;
}
