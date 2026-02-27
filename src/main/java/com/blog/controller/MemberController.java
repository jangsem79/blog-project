package com.blog.controller;

import org.springframework.stereotype.Controller;

import com.blog.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
}
