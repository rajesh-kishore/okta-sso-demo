package com.kishore.oktassodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class OktaSsoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktaSsoDemoApplication.class, args);
	}


	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
