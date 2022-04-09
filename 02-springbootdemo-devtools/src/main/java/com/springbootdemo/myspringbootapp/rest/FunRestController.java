package com.springbootdemo.myspringbootapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// expose "/" that return hello world

	@GetMapping("/")
	public String sayHello() {
		return "Hello World! the current time is "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Do a run for 10 KM daily!!!!";
	}
}
