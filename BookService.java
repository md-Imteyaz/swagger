package com.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger.dao.BookRepo;
import com.swagger.model.Book;

@Service
public class BookService {
	@Autowired
	private BookRepo bookrepo;

	public String Savebook(Book book) {
		bookrepo.save(book);
		return "book save with id" + book.getBookId();

	}

	public Optional<Book> getbook(int bookId) {
		return bookrepo.findById(bookId);

	}

	public List<Book> removeBook(int bookId) {
		bookrepo.deleteById(bookId);
		return bookrepo.findAll();

	}
}
