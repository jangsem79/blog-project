package com.blog.mapper;

import com.blog.dto.MemberDTO;

public interface Member {

	int insertUser(MemberDTO user);
    MemberDTO selectUserByUsername(String username);
    MemberDTO selectUserByEmail(String email);
}
