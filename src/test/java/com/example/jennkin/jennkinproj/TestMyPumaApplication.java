package com.example.jennkin.jennkinproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMyPumaApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyPumaApplication::main).with(TestMyPumaApplication.class).run(args);
	}

}
