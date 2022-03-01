package com.example.testingwithspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testHelloWorldController() throws Exception {
		/*
		mockMvc.perform(MockMvcRequestBuilders.get("/test"))
		.andExpect(status().isOk())
		.andExpect(content().string("Test"))
		.andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN));
		*/
		mockMvc.perform(MockMvcRequestBuilders.get("/test"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Hello world from rest controller!"))
		.andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN));
	}
}
