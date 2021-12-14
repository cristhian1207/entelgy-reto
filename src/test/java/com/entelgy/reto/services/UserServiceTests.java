package com.entelgy.reto.services;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.entelgy.reto.controllers.UserController;

@WebMvcTest(UserController.class)
public class UserServiceTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private IUserService userService;

	@Test
	public void postApiUsers() throws Exception {
		Map<String, Object> mockData = new HashMap<String, Object>();
		mockData.put("data", new ArrayList<>());

		when(userService.usersData()).thenReturn(mockData);
		this.mockMvc.perform(post("/users")).andDo(print()).andExpect(status().isOk())
			.andExpect(content().json("{'data': []}"));
	}
}
