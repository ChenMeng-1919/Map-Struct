package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserVO3;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:47
 * @description:
 */
@Mapper
public interface User3Mapper extends BaseMapper<UserDTO, UserVO3>{

    User3Mapper INSTANCE = Mappers.getMapper(User3Mapper.class);

    @Mapping(source = "name", target = "nickName")
    @Override
    UserVO3 to(UserDTO var1);

    @InheritInverseConfiguration
    @Override
    UserDTO from(UserVO3 var1);
}
