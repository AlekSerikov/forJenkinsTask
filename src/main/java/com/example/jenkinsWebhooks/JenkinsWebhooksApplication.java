package com.example.jenkinsWebhooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsWebhooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsWebhooksApplication.class, args);
	}

	@GetMapping("/")
	public String getMessage (){
		return "I'm from webhook!!!!";
	}
}
