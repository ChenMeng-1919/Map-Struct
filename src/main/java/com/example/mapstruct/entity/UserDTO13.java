package com.example.mapstruct.entity;

import lombok.*;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2022/6/20 16:56
 * @description:
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO13 {
    private String name;

    private Integer age;

    private Date createTime;

    private Date updateTime;

    private Double wallet;
}
