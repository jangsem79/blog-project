package com.blog.controller;

import org.springframework.stereotype.Controller;

import com.blog.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
}
