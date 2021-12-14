package com.entelgy.reto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entelgy.reto.controllers.UserController;

@SpringBootTest
class EntelgyRetoApplicationTests {

	@Autowired
	private UserController userController;

	@Test
	void contextLoads() throws Exception {
		assertThat(userController).isNotNull();
	}
}
