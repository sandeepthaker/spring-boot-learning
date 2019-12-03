package com.learning.boot.springbootlearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getBooks(){
        return Arrays.asList(new Book(1L,"Learning Spring Boot Demo","Sandeep Thaker"));
    }
}
