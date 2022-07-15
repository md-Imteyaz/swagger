package com.swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.model.Book;
import com.swagger.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
@Api(value="Book service ", description="my book store")
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/save")
	@ApiOperation(value="store books api")
	public String Savebook(@RequestBody Book book) {
		return bookservice.Savebook(book);
	}
	@GetMapping("/searchBook/{bookId}")
	@ApiOperation(value="search book api")

	public Optional<Book> getbook(@PathVariable int bookId ) {
		return bookservice.getbook(bookId);
	}
	
	@GetMapping("/deleteBook/{bookId}")
	@ApiOperation(value="delete book api")

	public List<Book> deletBook(@PathVariable int bookId ) {
		return bookservice.removeBook(bookId);
	}

}
