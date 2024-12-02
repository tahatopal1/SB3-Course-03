package com.project.demo.service;

import com.project.demo.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
