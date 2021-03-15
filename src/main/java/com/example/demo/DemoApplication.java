package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${name}")
	private String name;

	DemoApplication() {
		echo();
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	public void echo() {
		System.out.println("name==" + name);
	}
}
