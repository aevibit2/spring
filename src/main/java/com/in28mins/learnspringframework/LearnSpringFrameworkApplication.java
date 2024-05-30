package com.in28mins.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		Set<Integer> abc = new HashSet<>();
		abc.size();
	}

}
