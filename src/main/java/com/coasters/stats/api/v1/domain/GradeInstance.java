package com.coasters.stats.api.v1.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
public class GradeInstance {
    @Id
    private String id;
    private Float score;
}
