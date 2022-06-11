package com.arnaldoneto.libraryapi.service;

import com.arnaldoneto.libraryapi.model.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book save(Book book);
}
