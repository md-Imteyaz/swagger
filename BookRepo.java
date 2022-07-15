package com.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagger.model.Book;
@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{

}
