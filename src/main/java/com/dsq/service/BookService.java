package com.dsq.service;

import com.dsq.pojo.Books;

import java.util.List;
import java.util.Map;

public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书
    List<Books> queryAllBook();

    //根据书名查询书籍
    Books queryBookByName(String bookName);

    //分页查询
    List<Books> queryBookByLimit(Map<String, Integer> map);
}
