package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 
 * @RequestMapping Method ๋จ๋ ๋งคํ
 * 
 */

@Controller
public class BoardController {

	@ResponseBody
	@RequestMapping("/board/write")
	public String wirte() {
		return "BoardController.write()";
	}

	@ResponseBody
	@RequestMapping("/board/writeform")
	public String wirteForm() {
		return "BoardController.writeForm()";
	}

	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable("no") int no) {
		return "BoardController.view(" + no + ")";
	}

}
