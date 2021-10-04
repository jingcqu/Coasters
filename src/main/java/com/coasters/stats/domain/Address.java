package com.coasters.stats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 24/09/2021
 */

@Data
public class Address {
    @Id
    private UUID id;
    private String state;
    private String city;
    private String streetAddress;
    private String zipCode;
}
