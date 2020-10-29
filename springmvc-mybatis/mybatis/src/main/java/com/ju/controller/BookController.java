package com.ju.controller;

import com.ju.pojo.Books;
import com.ju.service.BookService;
import com.ju.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/all")
    public String allBook(Model model){
        List<Books> books = bookService.selectAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }


}
