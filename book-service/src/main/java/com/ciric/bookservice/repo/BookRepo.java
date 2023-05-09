package com.ciric.bookservice.repo;

import java.util.ArrayList;
import java.util.List;

import com.ciric.bookservice.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepo {

    private List<Book> books = new ArrayList<>();

    public Book add(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElseThrow();
    }

    public List<Book> findByBookshelf(int bookshelfId) {
        return books.stream().filter(book -> book.getBookshelfId() == bookshelfId).toList();
    }

}

