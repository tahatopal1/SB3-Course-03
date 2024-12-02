package com.project.demo.service;

import com.project.demo.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
