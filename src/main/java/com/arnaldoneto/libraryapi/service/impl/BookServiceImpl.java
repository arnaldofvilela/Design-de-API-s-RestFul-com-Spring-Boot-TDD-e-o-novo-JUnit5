package com.arnaldoneto.libraryapi.service.impl;

import com.arnaldoneto.libraryapi.exception.BusinessException;
import com.arnaldoneto.libraryapi.model.entity.Book;
import com.arnaldoneto.libraryapi.model.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements com.arnaldoneto.libraryapi.service.BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book){
        if(repository.existsByIsbn(book.getIsbn())){
            throw new BusinessException("Isbn já cadastrado.");
        }
        return repository.save(book);
        }

    @Override
    public Optional<Book> getById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public void delete(Book book) {
        if(book == null || book.getId() == null){
            throw new IllegalArgumentException("Book id can't be null");
        }
        this.repository.delete(book);
    }

    @Override
    public Book update(Book book) {
        if(book == null || book.getId() == null){
            throw new IllegalArgumentException("Book id can't be null.");
        }
        return this.repository.save(book);
    }
}
