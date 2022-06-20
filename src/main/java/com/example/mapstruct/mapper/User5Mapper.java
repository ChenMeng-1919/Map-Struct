package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserDTO2;
import com.example.mapstruct.entity.UserVO1;
import com.example.mapstruct.entity.UserVO12;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:57
 * @description:
 */
@Mapper(uses = DateMapper.class)
public interface User5Mapper  extends BaseMapper<UserDTO2, UserVO12> {
    User5Mapper INSTANCE = Mappers.getMapper(User5Mapper.class);
}
