package com.parakhi.secondgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.parakhi.secondgradle")
@EnableAutoConfiguration
public class ApplicationBoot {

	public static void main(String[] args) {
		
		SpringApplication.run(ApplicationBoot.class, args);
	}

}
