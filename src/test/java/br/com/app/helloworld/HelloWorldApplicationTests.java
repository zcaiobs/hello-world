package br.com.app.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("ok");
	}

	@Test
	void showMessage() {
		System.out.println("Hello World");
	}

}
