package com.goodroot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.goodroot.model.StudentDetails", "com.goodroot.service", "com.goodroot.studentRepo"})
public class GoodrootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodrootApplication.class, args);
	}

}
