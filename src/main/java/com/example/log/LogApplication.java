package com.example.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class LogApplication {

	private static final Logger logger = LoggerFactory.getLogger(LogApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);
		logger.trace("This is a TRACE log message");
        logger.debug("This is a DEBUG log message");
		logger.info("This is an INFO log message");
        logger.warn("This is a WARN log message");
        logger.error("This is an ERROR log message");
	}

}
