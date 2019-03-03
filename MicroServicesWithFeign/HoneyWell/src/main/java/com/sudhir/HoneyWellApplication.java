package com.sudhir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HoneyWellApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoneyWellApplication.class, args);
	}

}
