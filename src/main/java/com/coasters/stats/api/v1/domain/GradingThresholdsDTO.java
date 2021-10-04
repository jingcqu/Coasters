package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradingThresholdsDTO {
    private UUID id;
    private List<Float> scoreThresholds;
    private List<String> valueLetter;
    private List<Float> valueNumerical;
}
