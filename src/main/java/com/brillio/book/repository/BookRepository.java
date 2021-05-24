package com.brillio.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brillio.book.model.Book;


@Repository
public interface BookRepository  extends MongoRepository<Book,Integer>{

}
