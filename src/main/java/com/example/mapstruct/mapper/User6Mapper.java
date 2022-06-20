package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserDTO2;
import com.example.mapstruct.entity.UserVO1;
import com.example.mapstruct.entity.UserVO12;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author: cm
 * @since: Created in 2022/6/20 18:02
 * @description:
 */
@Mapper(uses = {
        DateMapper1.class,
        DateMapper2.class
})
public interface User6Mapper extends BaseMapper<UserDTO2, UserVO12> {
    User6Mapper INSTANCE = Mappers.getMapper(User6Mapper.class);

    @Mappings({
            @Mapping(source = "createTime", target = "createTime", qualifiedByName = {"dateMapper1"}),
            @Mapping(source = "updateTime", target = "updateTime", qualifiedByName = {"dateMapper2"})
    })
    @Override
    UserVO12 to(UserDTO2 var1);
}