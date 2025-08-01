package com.gowtham.library.model;

import com.gowtham.library.model.BookStatus;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private BookStatus status;

    public Book(String isbn, String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.status=BookStatus.AVAILABLE;
    }
    //GETTERS
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookStatus getStatus() {return status;}

    public String getTitle() {
        return title;
    }


    //    SETERS
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setStatus(BookStatus status) {this.status = status;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}