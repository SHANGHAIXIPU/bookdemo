package com.example.booksdemo.service;

import com.example.booksdemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        List<Book> books = bookRepository.findAll();

        return books;
    }

    @Override
    public List<Map<String, Object>> getBooks2() {
        final List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from demo_book");
        return list;
    }
}
