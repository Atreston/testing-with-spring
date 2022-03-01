package com.example.testingwithspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	@GetMapping
	public boolean list() {
		return true;
	}
	@GetMapping("/{isbn}")
	public boolean get() {
		return true;
	}
	@PostMapping
	public boolean create() {
		return true;
	}
}
