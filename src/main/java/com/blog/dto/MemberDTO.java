package com.blog.dto;

import lombok.Data;

@Data
public class MemberDTO {

	private int id;
    private String username;
    private String password;
    private String email;
    private String createdAt;
    // getter, setter
}
