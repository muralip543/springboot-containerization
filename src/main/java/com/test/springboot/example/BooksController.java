package com.test.springboot.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	List<Books> books=new ArrayList<Books>();
	
	@PostMapping("/addBook")
	public Books addBook(@RequestBody Books book) {
		
		books.add(book);
		return book;
	}
	
	@GetMapping("/getBooks")
	public List<Books> getBooks(){
		return books;
	}
}
