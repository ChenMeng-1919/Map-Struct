package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:13
 * @description:
 */
// spring方式加载
//@Mapper(componentModel = "spring")
@Mapper(componentModel = "spring")
public interface UserMapper {
    // default方式加载
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     * 将DTO转VO
     *
     * @param userDTO
     * @return
     */
    UserVO userVO2UserDTO(UserDTO userDTO);
}
