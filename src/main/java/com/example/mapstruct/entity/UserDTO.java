package com.example.mapstruct.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2022/6/20 16:56
 * @description:
 */
@Data
@Builder
@ToString
public class UserDTO {
    private String name;

    private Integer age;

    private Date createTime;
}
