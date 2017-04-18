package org.kingder.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/17 9:34
 */
@RestController
@RequestMapping("/index")
public class HelloWorldController {
	private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping("/hello")
	public String index() {

		try {
			int i=1/0;
		}catch (Exception e){
			logger.error("主动抛出异常进行测试",e.getMessage(),e);
		}

		return "Hello World";
	}
}
