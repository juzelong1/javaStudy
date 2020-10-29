package com.ju.service;

import com.ju.dao.BookMapper;
import com.ju.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books selectBook(int id) {
        return bookMapper.selectBook(id);
    }

    public List<Books> selectAllBook() {
        return bookMapper.selectAllBook();
    }
}
