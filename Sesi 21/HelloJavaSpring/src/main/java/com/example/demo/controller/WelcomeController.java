package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/api/welcome")
public class WelcomeController {

	@GetMapping("/index")
	public String mainHello() {
		return "hello...Belajar SpringBoot";
		

	}

}
