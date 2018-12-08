package com.example.booksdemo.service;

import com.example.booksdemo.model.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

    /**
     * 获取所有的书
     * @return
     */
    public List<Book> getBooks();

    public List<Map<String,Object>> getBooks2();
}
