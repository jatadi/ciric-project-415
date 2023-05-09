package com.ciric.bookservice.model;

public class Book {

    private int id;
    private String name;
    private int year;
    private String author;
    private int rating;
    private int bookshelfId;

    public Book(int id, String name, int year, String author, int rating, int bookshelfId) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.author = author;
        this.rating = rating;
        this.bookshelfId = bookshelfId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBookshelfId() {
        return bookshelfId;
    }

    public void setBookshelfId(int bookshelfId) {
        this.bookshelfId = bookshelfId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                ", bookshelfId=" + bookshelfId +
                '}';
    }
}

