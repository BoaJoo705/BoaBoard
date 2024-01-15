package com.board.jooboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

//@PropertySource(value = {
//		"classpath:application.properties",
//	}, ignoreResourceNotFound = true)

@SpringBootApplication
public class JooBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooBoardApplication.class, args);
		System.out.println("hello java");
		System.out.println("안녕");
	}

}
