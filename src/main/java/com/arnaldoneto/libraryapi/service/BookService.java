package com.arnaldoneto.libraryapi.service;

import com.arnaldoneto.libraryapi.model.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface BookService {

    Book save(Book book);

    Optional<Book> getById(Long id);

    void delete(Book book);
}
