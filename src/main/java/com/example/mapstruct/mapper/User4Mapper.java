package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserVO1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:41
 * @description:
 */
@Mapper
public interface User4Mapper extends BaseMapper<UserDTO, UserVO1>{

    User4Mapper INSTANCE = Mappers.getMapper(User4Mapper.class);

    @Mappings({
            // 要忽略的字段
            @Mapping(target = "createTime",ignore = true)
    })
    @Override
    UserVO1 to(UserDTO var1);
}
