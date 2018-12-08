package com.example.booksdemo.service;

import com.example.booksdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{
}
