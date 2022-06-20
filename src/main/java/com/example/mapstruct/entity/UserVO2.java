package com.example.mapstruct.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: cm
 * @since: Created in 2022/6/20 16:59
 * @description:
 */
@Data
@ToString
@NoArgsConstructor
public class UserVO2 {

    private String name;

    private Integer age;

    // 类型和VO对象不同
    private String country;

    private String province;

    private String city;
}
