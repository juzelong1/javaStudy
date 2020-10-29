package com.ju.service;

import com.ju.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBook(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books selectBook(int id);

    //查询所有书
    List<Books> selectAllBook();
}
