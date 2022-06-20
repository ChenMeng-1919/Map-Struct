package com.example.mapstruct.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2022/6/20 16:59
 * @description:
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    private String name;

    private Integer age;

    private Date createTime;
}
