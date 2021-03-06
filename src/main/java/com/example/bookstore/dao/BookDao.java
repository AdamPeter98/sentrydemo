package com.example.bookstore.dao;

import com.example.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookDao extends JpaRepository<Book, Long> {

    List<Book> findByNameContaining(String name);
}
