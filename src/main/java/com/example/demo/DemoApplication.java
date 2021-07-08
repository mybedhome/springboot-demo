package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	// 启动类中@Value注解无效，获取不到注入的值
	@Value("${name}")
	private static String name = "jack wu";

	DemoApplication() {
		System.out.println("运行构造方法");
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		echo();
	}

	public static void echo() {
		System.out.println("name==" + name);
	}
}
