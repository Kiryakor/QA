package com.javatechie.travis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ServletComponentScan
public class TravisCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravisCiCdApplication.class, args);
	}
}
