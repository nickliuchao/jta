package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example" })
@MapperScan(basePackages = "com.example.demo")
public class JtaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtaApplication.class, args);
	}

}
