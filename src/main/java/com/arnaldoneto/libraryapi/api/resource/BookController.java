package com.arnaldoneto.libraryapi.api.resource;

import com.arnaldoneto.libraryapi.api.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create( @RequestBody BookDTO dto ){
        return dto;
    }
}
