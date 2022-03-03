package com.example.testingwithspring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Book attributes")
class BookTest {
	@Test
	void test() {
		//fail("Not yet implemented");
		Book book = new Book();
		book.setTitle("Beginning Java Unit Testing with JUnit 5");
		book.setIsbn("123");
		List<String> authors = new ArrayList<String>();
		book.setAuthors(authors);
		assertEquals("Beginning Java Unit Testing with JUnit 5", book.getTitle());
		assertEquals("123", book.getIsbn());
	}
}
