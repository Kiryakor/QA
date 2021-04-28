package com.javatechie.travis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class TravisCiCdApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplicationBuilder(TravisCiCdApplication.class).build();
		app.run(args);
	}
}
