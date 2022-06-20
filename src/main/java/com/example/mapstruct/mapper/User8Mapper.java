package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.*;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author: cm
 * @since: Created in 2022/6/20 18:40
 * @description:
 */
@Mapper
public interface User8Mapper extends BaseMapper<UserDTO14, UserVO14> {

    User8Mapper INSTANCE = Mappers.getMapper(User8Mapper.class);

    @Mapping(source = "deposit", target = "deposit", numberFormat = "#.##E0")
    @Override
    UserVO14 to(UserDTO14 var1);

    @Mapping(source = "deposit", target = "deposit", numberFormat = "#.##E0")
    @Override
    UserDTO14 from(UserVO14 var1);
}