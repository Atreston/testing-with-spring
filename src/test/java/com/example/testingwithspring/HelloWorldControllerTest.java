package com.example.testingwithspring;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldController.class)
class HelloWorldControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void testHelloWorldController() throws Exception {
		/*
		mockMvc.perform(MockMvcRequestBuilders.get("/test"))
		.andExpect(status().isOk())
		.andExpect(content().string("Test"))
		.andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN));
		*/
		mockMvc.perform(MockMvcRequestBuilders.get("/test"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.TEXT_PLAIN));
	}

}
