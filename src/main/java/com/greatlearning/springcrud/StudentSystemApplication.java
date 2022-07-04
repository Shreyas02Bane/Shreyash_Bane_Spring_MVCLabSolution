
package com.greatlearning.springcrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lab6 - Spring Boot project is Up and Running");
		
	}

}