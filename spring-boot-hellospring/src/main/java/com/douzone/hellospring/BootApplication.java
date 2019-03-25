package com.douzone.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.douzone.hellospring.controller")

@SpringBootApplication       //위에 3가지가 2.대의 version으로 들어오면서 SpringBootApplication으로 통일되었다.
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);

	}

}
