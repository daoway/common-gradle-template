package com.blogspot.ostas.apps.cloud;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

	@Test
	void appHasAGreeting() {
		App classUnderTest = new App();
		assertThat(classUnderTest.getGreeting()).isNotEmpty();
	}

}
