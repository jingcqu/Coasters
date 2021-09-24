package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class GradingThresholds {
    @Id
    private String id;
    private List<Float> scoreThresholds;
    private List<String> valueLetter;
    private List<Float> valueNumerical;
}
