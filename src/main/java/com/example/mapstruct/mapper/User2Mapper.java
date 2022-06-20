package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.AddressDTO;
import com.example.mapstruct.entity.UserDTO;
import com.example.mapstruct.entity.UserVO2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:43
 * @description:
 */
@Mapper
public interface User2Mapper {
    User2Mapper INSTANCE = Mappers.getMapper(User2Mapper.class);

    // 如果无特殊字段，可以不配置Mappings
    // 会自动把两个源对象中的属性复制到目标对象
    @Mappings({
            @Mapping(source = "userDTO.name",target = "name"),
            @Mapping(source = "addressDTO.country",target = "country")
    })
    UserVO2 to(UserDTO userDTO, AddressDTO addressDTO);
}
