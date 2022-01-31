package com.hatchways.app;

import com.Hatchways.App;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

	@Test
	void contextLoads() {
		
		// Check if the application is running with the correct port
		App.main(new String[] {"--server.port=8080"});
	}

}
