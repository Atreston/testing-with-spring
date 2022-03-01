package com.example.testingwithspring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitControllerTest {
	
	@Test
	public void testHomeController() {
		HomeController homeController = new HomeController();
		String result = homeController.home();
		assertEquals(result, "Hello World!");
	}
}
