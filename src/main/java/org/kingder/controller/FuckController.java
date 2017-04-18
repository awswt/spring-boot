package org.kingder.controller;

import org.kingder.model.Fuck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/14 10:23
 */
@Controller
@RequestMapping("/fuck")
public class FuckController {
	private static Logger logger = LoggerFactory.getLogger(FuckController.class);
	@Value("${fuck.sentence}")
	private String template ;
	private final AtomicLong counter = new AtomicLong();
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Fuck sayFuck(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		logger.info("the param is :"+name);
		return new Fuck(counter.incrementAndGet(),
				String.format(template, name));
	}
}
