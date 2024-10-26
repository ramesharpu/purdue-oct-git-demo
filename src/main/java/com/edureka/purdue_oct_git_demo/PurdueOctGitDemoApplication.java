package com.edureka.purdue_oct_git_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PurdueOctGitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurdueOctGitDemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return String.format("<h1>Hello There!!! Welcome to my project</h1>");
	}

}
