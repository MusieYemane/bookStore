package com.mosi.bookStore.controller;

import com.mosi.bookStore.domain.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBook(){

        BookDto book= BookDto.builder()
                .title("My name is Jeff")
                .build();

        List<BookDto> books= new ArrayList<>();
        books.add(book);

        return ResponseEntity.ok(books);
    }
}
