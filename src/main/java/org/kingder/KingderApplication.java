package org.kingder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class KingderApplication {
	private static Logger logger = LoggerFactory.getLogger(KingderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KingderApplication.class, args);
		logger.info("Application is started!");
	}
}
