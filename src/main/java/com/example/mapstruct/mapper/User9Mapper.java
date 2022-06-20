package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author: cm
 * @since: Created in 2022/6/20 18:40
 * @description:
 */
@Mapper
public interface User9Mapper extends BaseMapper<UserDTO15, UserVO2> {
    User9Mapper INSTANCE = Mappers.getMapper(User9Mapper.class);

    @Mapping(source = "addressDTO.country", target = "country")
    @Override
    UserVO2 to(UserDTO15 userDTO);

    // 反向配置
    @InheritInverseConfiguration(name = "to")
    @Override
    UserDTO15 from(UserVO2 var1);
}