package com.coasters.stats.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document
@AllArgsConstructor
public class GradeInstance {
    @Id
    private UUID id;
    private Float score;
}
