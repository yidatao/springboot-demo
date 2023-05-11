package com.example.mvcdemo;

import com.example.mvcdemo.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class MvcDemoApplicationTests {

	@Autowired
	private StudentController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

