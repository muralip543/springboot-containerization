package com.test.springboot.example;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class HelloWorldController {

	

	@GetMapping("/hello")
	public String sayhello() {
		Gson gson=new Gson();

		Books books=new Books();
		books.setId("1");
		books.setName("Apple");
		books.setTitle("Titanic");
		System.out.println(gson.toJson(books));
		return "welcome to docker containerization automation";
	}

	@GetMapping("/str")
	public String printMessage(@PathParam("str") String str) {

		System.out.println("Hai " + str);

		Gson gson = new Gson();

		return "welcome to code pipeline project " + gson.toJson(MySecrets.getSecret());
	}

}
