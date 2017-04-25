package org.kingder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/14 17:36
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("")
	public String index() {
		return "index";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}