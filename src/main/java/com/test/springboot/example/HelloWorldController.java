package com.test.springboot.example;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayhello() {

		return "welcome to docker containerization automation";
	}

	@GetMapping("/str")
	public String printMessage(@PathParam("str") String str) {

		System.out.println("Hai " + str);

		return "welcome to code pipeline project " + str;
	}

}
