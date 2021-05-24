package com.brillio.book.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.book.model.Book;
import com.brillio.book.repository.BookRepository;


@Service
public class BookService {
	
	
@Autowired
     private BookRepository repository;
	
	public Book saveBook(Book book) {
		return repository.save(book); //insert	
	}
	
	public List<Book> getBook() {
		return repository.findAll(); //select
	}

}
