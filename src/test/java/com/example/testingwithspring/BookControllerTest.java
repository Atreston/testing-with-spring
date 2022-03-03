package com.example.testingwithspring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@DisplayName("Testing /books /books/id URI")
class BookControllerTest {
	BookController bookController = new BookController();
	@Test
	void testBookControllerGetMapping() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/books"))
			.andExpect(MockMvcResultMatchers.status().isOk());
		mockMvc.perform(MockMvcRequestBuilders.get("/books/123"))
			.andExpect(MockMvcResultMatchers.status().isOk());
		mockMvc.perform(MockMvcRequestBuilders.post("/books"))
			.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
