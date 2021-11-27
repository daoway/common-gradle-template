package com.blogspot.ostas.apps.cloud;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

	public String getGreeting() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		log.info(new App().getGreeting());
	}

}
