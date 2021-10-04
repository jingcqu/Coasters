package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document
public class GradeGroup {
    @Id
    private UUID id;
    private String description;
    private List<GradeInstance> gradeInstances;
}
