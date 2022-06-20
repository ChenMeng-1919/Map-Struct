package com.example.mapstruct.mapper;

import java.util.List;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:37
 * @description:
 */
public interface BaseMapper<SOURCE, TARGET> {

    TARGET to(SOURCE var1);

    List<TARGET> to(List<SOURCE> var1);

    SOURCE from(TARGET var1);

    List<SOURCE> from(List<TARGET> var1);

}
