package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserDTO13;
import com.example.mapstruct.entity.UserVO1;
import com.example.mapstruct.entity.UserVO13;
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
public interface User7Mapper extends BaseMapper<UserDTO13, UserVO13> {
    User7Mapper INSTANCE = Mappers.getMapper(User7Mapper.class);

    @Mapping(source = "wallet", target = "wallet", numberFormat = "$#.00")
    @Override
    UserVO13 to(UserDTO13 var1);

    @Mapping(source = "wallet", target = "wallet", numberFormat = "$#.00")
    @Override
    UserDTO13 from(UserVO13 var1);

    @IterableMapping(numberFormat = "$#.00")
    List<String> doubleList2String(List<Double> vas);

    @IterableMapping(numberFormat = "$#.00")
    List<Double> stringList2Double(List<String> vas);
}
