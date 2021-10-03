package com.coasters.stats.api.v1.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class GradeGroup {
    @Id
    private String id;
    private String description;
    private List<GradeInstance> gradeInstances;
}
