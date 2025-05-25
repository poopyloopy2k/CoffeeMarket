package com.internet.cafe.internet_cafe_backend;

import org.springframework.boot.SpringApplication;

public class TestInternetCafeApplication {

	public static void main(String[] args) {
		SpringApplication.from(InternetCafeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
