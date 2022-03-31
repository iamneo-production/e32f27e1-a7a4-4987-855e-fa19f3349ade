package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
		System.out.println("Starting code");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting Code");
	}
}
