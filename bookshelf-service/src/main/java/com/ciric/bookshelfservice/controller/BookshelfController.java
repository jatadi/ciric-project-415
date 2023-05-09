package com.ciric.bookshelfservice.controller;

import com.ciric.bookshelfservice.model.Book;
import com.ciric.bookshelfservice.model.Bookshelf;
import com.ciric.bookshelfservice.repo.BookshelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bookshelf")
public class BookshelfController {

    @Autowired
    private BookshelfRepo bookshelfRepo;
    @Autowired
    private RestTemplate restTemplate;


    @PostMapping
    public Bookshelf add(@RequestBody Bookshelf bookshelf) {
        return bookshelfRepo.addBookshelf(bookshelf);
    }

    @GetMapping
    public List<Bookshelf> findAll() {
        return bookshelfRepo.findAll();
    }

    @GetMapping("/{id}")
    public Bookshelf findById(@PathVariable int id ) {
        return bookshelfRepo.findById(id);
    }

    @GetMapping("/withBooks")
    public List<Bookshelf> findAllWithBooks() {
        List<Bookshelf> bookshelves = bookshelfRepo.findAll();
        if (bookshelves == null) {
            return new ArrayList<Bookshelf>();
        }
        for (Bookshelf bookshelf : bookshelves) {
            Book[] books = restTemplate.getForObject("http://localhost:8081/book/bookshelf/" + bookshelf.getId(), Book[].class);
            bookshelf.setBooks(Arrays.asList(books));
        }

        return bookshelves;
    }


}