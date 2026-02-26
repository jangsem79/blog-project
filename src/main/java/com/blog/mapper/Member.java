package com.blog.mapper;

public interface Member {

	int insertUser(UserDto user);
    UserDto selectUserByUsername(String username);
    UserDto selectUserByEmail(String email);
}
