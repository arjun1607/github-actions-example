package com.javatechie.Github.Actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to java app";
	}


	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

}
