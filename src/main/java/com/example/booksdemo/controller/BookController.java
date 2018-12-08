package com.example.booksdemo.controller;

import com.example.booksdemo.model.Book;
import com.example.booksdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/list")
    public String bookList(Model model){
        // 业务逻辑，查找出所需的model数据
        final List<Map<String, Object>> books2 = bookService.getBooks2();
        model.addAttribute("books",books2);
        return "/book/list2";  //return view 去展示
    }
    @GetMapping("/book/list2")
    public String bookList2(Model model){
        // 业务逻辑，查找出所需的model数据
        List<Book> books = bookService.getBooks();
        model.addAttribute("books",books);
        return "/book/list2";  //return view 去展示
    }

    @GetMapping("/book/{id}/comment")
    public String comment(@PathVariable("id") Long id){

        return "/book/comment";
    }
}
