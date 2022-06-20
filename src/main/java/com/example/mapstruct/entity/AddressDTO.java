package com.example.mapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:42
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {
    private String country;

    private String province;

    private String city;
}
