package com.sample.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/display")
	public String displayMessage() {
		return "Hi there, I am REST API from JAVA app";
	}
}
