package com.ju.dao;

import com.ju.pojo.Books;
import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBook(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books selectBook(@Param("bookId") int id);

    //查询所有书
    List<Books> selectAllBook();

}
