package com.example.testingwithspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/test")
	public String hello() {
		return "Hello world from rest controller!";
	}
}
