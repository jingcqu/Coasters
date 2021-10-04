package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 24/09/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private UUID id;
    private String state;
    private String city;
    private String streetAddress;
    private String zipCode;
}
