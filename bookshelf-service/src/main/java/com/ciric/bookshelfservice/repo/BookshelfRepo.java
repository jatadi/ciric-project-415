package com.ciric.bookshelfservice.repo;

import com.ciric.bookshelfservice.model.Bookshelf;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookshelfRepo {

    private List<Bookshelf> bookshelves = new ArrayList<>();

    public Bookshelf addBookshelf(Bookshelf bookshelf) {
        bookshelves.add(bookshelf);
        return bookshelf;
    }

    public Bookshelf findById(int id) {
        return bookshelves.stream().filter(bookshelf -> bookshelf.getId() == id).findFirst().orElseThrow();

    }

    public List<Bookshelf> findAll() {
        return bookshelves;
    }
}