package com.brillio.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.book.model.Book;
import com.brillio.book.service.BookService;

@RestController //request and to make response 
@RequestMapping("/book")
public class BookController {
	
	
	
	@Autowired
	private BookService service;
	//request handler methods
	
	@PostMapping("/save")
	public Book save(@RequestBody Book book) {
		return service.saveBook(book);
	}
	
	@GetMapping("/get")
	public List<Book> get(Book book) {
		return service.getBook();
		
	}

}
