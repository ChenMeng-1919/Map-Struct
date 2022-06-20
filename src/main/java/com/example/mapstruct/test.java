package com.example.mapstruct;

import com.example.mapstruct.entity.*;
import com.example.mapstruct.mapper.*;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: cm
 * @since: Created in 2022/6/20 17:00
 * @description:
 */

public class test {

    @Autowired
    UserMapper userMapper;

    @Test
    public void beanCopy() {
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();

        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userDTO, userVO);
        System.out.println(userVO);

        UserVO1 userVO1 = new UserVO1();
        BeanUtils.copyProperties(userDTO, userVO1);
        System.out.println(userVO1);
    }

    @Test
    public void test() {
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();
        UserVO userVO = UserMapper.INSTANCE.userVO2UserDTO(userDTO);
        System.out.println(userVO);
    }

    @Test
    public void springTest() {
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();
        UserVO userVO = userMapper.userVO2UserDTO(userDTO);
        System.out.println(userVO);
    }
    @Test
    public void test1(){
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();

        UserVO1 userVO1 = User1Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO1);

        List<UserDTO> userDTOS = new ArrayList<>();
        userDTOS.add(userDTO);
        List<UserVO1> userVO1s = User1Mapper.INSTANCE.to(userDTOS);
        System.out.println(userVO1s);
    }

    @Test
    public void test4(){
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();

        UserVO1 userVO1 = User4Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO1);
    }

    @Test
    public void test2(){
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();

        AddressDTO addressDTO = AddressDTO.builder()
                .country("中国")
                .province("北京")
                .city("北京")
                .build();
        UserVO2 userVO2 = User2Mapper.INSTANCE.to(userDTO, addressDTO);
        System.out.println(userVO2);
    }

    @Test
    public void test3(){
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();

        UserVO3 userVO3 = User3Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO3);
    }

    @Test
    public void test32(){
        UserDTO userDTO = UserDTO.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .build();

        UserVO3 userVO3 = User3Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO3);

        UserDTO userDTO1 = User3Mapper.INSTANCE.from(userVO3);
        System.out.println(userDTO1);
    }


    @Test
    public void test5(){
        UserDTO2 userDTO = UserDTO2.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .updateTime(new Date())
                .build();

        UserVO12 userVO12 = User5Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO12);
    }

    @Test
    public void test6(){
        UserDTO2 userDTO = UserDTO2.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .updateTime(new Date())
                .build();

        UserVO12 userVO1 = User6Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO1);
    }

    @Test
    public void test7(){
        UserDTO13 userDTO = UserDTO13.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .updateTime(new Date())
                .wallet(10000.45678)
                .build();

        UserVO13 userVO1 = User7Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO1);

        UserDTO13 userDTO1 = User7Mapper.INSTANCE.from(userVO1);
        System.out.println(userDTO1);

        List<Double> vas = new ArrayList<>();
        vas.add(123.5585);
        vas.add(784.1565488);
        vas.add(12.11243);
        // string list转 double
        List<String> strings = User7Mapper.INSTANCE.doubleList2String(vas);
        System.out.println(strings);

        // double list 转 string
        List<Double> doubles = User7Mapper.INSTANCE.stringList2Double(strings);
        System.out.println(doubles);
    }

    @Test
    public void test8(){
        UserDTO14 userDTO = UserDTO14.builder()
                .name("张三")
                .age(10)
                .createTime(new Date())
                .updateTime(new Date())
                .wallet(10000.45678)
                .deposit(new BigDecimal(10000000.324))
                .build();

        UserVO14 userVO1 = User8Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO1);
        UserDTO14 userDTO1 = User8Mapper.INSTANCE.from(userVO1);
        System.out.println(userDTO1);
    }

    @Test
    public void test9(){
        UserDTO15 userDTO = UserDTO15.builder()
                .name("张三")
                .age(10)
                .addressDTO(AddressDTO.builder().country("中国").build())
                .build();

        UserVO2 userVO2 = User9Mapper.INSTANCE.to(userDTO);
        System.out.println(userVO2);

        UserDTO15 userDTO1 = User9Mapper.INSTANCE.from(userVO2);
        System.out.println(userDTO1);
    }




}
