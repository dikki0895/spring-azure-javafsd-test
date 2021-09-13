package com.javafsd.springazurejavafsdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureJavafsdTestApplication {
	
	public String message() {
		return "Congratulations we have deployed our application in Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureJavafsdTestApplication.class, args);
	}

}
