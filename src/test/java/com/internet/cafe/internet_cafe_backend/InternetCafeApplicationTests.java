package com.internet.cafe.internet_cafe_backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class InternetCafeApplicationTests {

	@Test
	void contextLoads() {
	}

}
