package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;



import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootDemoApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
//		System.out.println(userService.findAll());
	}

	@LocalServerPort
	private int port;
//	@Test
//	public void indexControllerTest() {
//		String body = this.restTemplate.getForObject("/index", String.class);
//		assertThat(body).isEqualTo("ok"+port);
//	}

}
