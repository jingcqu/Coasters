package com.coasters.stats.api.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * author: jingcqu
 * on: 24/09/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private String id;
    private String state;
    private String city;
    private String streetAddress;
    private String zipCode;
}
