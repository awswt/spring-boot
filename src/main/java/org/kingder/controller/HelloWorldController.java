package org.kingder.controller;

import org.kingder.entity.User;
import org.kingder.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/hello")
	public String index() {

		try {
			int i=1/0;
		}catch (Exception e){
			logger.error("主动抛出异常进行测试",e.getMessage(),e);
		}

		return "Hello World";
	}


	@RequestMapping("/getUser")
	@Cacheable(value="user-key")
	public User getUser() {
		User user = userRepository.findByUserName("cc3");
		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
		return user;
	}
}
