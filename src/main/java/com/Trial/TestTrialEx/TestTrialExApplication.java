package com.Trial.TestTrialEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Trial.TestTrialEx.*")
public class TestTrialExApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTrialExApplication.class, args);
	}

}
