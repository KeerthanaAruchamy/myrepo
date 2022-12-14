package com.process.demo;


import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsappTestApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsappTestApplication.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true,true);
	}

}
