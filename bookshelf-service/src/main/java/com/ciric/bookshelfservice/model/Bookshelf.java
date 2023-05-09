package com.ciric.bookshelfservice.model;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private int id;
    private int floor;
    private List<Book> books = new ArrayList<>();

    public Bookshelf() {
    }

    public Bookshelf(int id, int floor) {
        this.id = id;
        this.floor = floor;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "id=" + id +
                ", floor=" + floor +
                ", books=" + books +
                '}';
    }


}
