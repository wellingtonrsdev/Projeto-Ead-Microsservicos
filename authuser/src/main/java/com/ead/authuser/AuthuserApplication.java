package com.ead.authuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthuserApplication {

	public static void main(String[] args) {
		System.out.println(">>> CONFIG LOADED <<<");
		SpringApplication.run(AuthuserApplication.class, args);
	}

}
