package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserVO1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:38
 * @description:
 */
@Mapper
public interface User1Mapper extends BaseMapper<UserDTO, UserVO1>{

    User1Mapper INSTANCE = Mappers.getMapper(User1Mapper.class);

    @Mappings({
            @Mapping(source = "createTime",target = "createTime",dateFormat = "yyyyMMdd")
    })
    @Override
    UserVO1 to(UserDTO var1);
}
