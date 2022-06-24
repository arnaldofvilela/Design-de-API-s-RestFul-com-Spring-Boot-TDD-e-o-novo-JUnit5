package com.arnaldoneto.libraryapi.model.repository;

import com.arnaldoneto.libraryapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


    boolean existsByIsbn(String isbn);
}
