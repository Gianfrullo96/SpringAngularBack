package com.gf.back.spring.security.angular.mappers;


import com.gf.back.spring.security.angular.dtos.SignUpDto;
import com.gf.back.spring.security.angular.dtos.UserDto;
import com.gf.back.spring.security.angular.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {


    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
