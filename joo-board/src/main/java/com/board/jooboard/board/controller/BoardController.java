package com.board.jooboard.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping("/board")
	public String index() {
		return "board/board";
	}
	
	@RequestMapping("/board/write")
	public String detail() {
		return "board/detail";
	}
	
//	@RequestMapping("/board/insert")
//	public String insert() {
//		
//	}
}
