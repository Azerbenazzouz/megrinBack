package com.azer.megrinBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MegrinBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegrinBackApplication.class, args);
	}
	
}
