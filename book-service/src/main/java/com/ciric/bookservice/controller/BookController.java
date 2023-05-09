package com.ciric.bookservice.controller;

import java.util.List;

import com.ciric.bookservice.model.Book;
import com.ciric.bookservice.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookRepo.add(book);
    }

    @GetMapping
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") int id) {
        return bookRepo.findById(id);
    }

    @GetMapping("/bookshelf/{bookshelfId}")
    public List<Book> findByBookshelf(@PathVariable("bookshelfId") int bookshelfId) {
        return bookRepo.findByBookshelf(bookshelfId);
    }

}