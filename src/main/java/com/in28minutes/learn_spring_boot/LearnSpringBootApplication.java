package com.in28minutes.learn_spring_boot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringBootApplication.class, args);
		SpringApplication app = new SpringApplication(LearnSpringBootApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
        app.run(args);
	}

}
