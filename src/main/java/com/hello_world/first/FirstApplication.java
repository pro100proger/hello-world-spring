package com.hello_world.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstApplication {
	@GetMapping
	public List<String> helloWorld()
	{
		return List.of("Hello ", "world! ");
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

}
