package com.wearebrain.livecoding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.transaction.Transactional;

@SpringBootTest
@ActiveProfiles(profiles = {"test"})
class LiveCodingApplicationTests {

	@Test
	@Transactional
	void contextLoads() {
	}

}
