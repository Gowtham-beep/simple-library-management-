package com.gowtham.library.service;
import com.gowtham.library.model.*;

import java.util.*;

public class LibraryService {
    private Map<String, Book> books = new HashMap<>();

    //add a new book
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    //borrow the book
    public boolean borrowBook(String isbn, User user) {
        Book book = books.get(isbn);
        if (book != null && book.getStatus() == BookStatus.AVAILABLE) {
            book.setStatus(BookStatus.BORROWED);
            System.out.println(user.getName() + "borrowed" + book.getTitle());
            return true;
        }
        return false;
    }

    //return the book
    public boolean returnBook(String isbn, User user) {
        Book book = books.get(isbn);
        if (book != null && book.getStatus() != BookStatus.BORROWED) {
            book.setStatus(BookStatus.AVAILABLE);
            System.out.println(user.getName() + " returned " + book.getTitle());
            return true;
        }
        return false;
    }

    //reserve a book
    public boolean reserveBook(String isbn, User user) {
        Book book = books.get(isbn);
        if (book != null && book.getStatus() == BookStatus.AVAILABLE) {
            book.setStatus(BookStatus.RESERVED);
            System.out.println(user.getName() + " reserved the book " + book.getTitle());
            return true;
        }
        return false;
    }

    //mark book a s lost
    public boolean bookLost(String isbn, User user) {
        Book book = books.get(isbn);
        if (book != null && book.getStatus() != BookStatus.LOST) {
            book.setStatus(BookStatus.LOST);
            System.out.println(book.getTitle() + " is LOST");
            return true;
        }
        return false;
    }

    //getinfo
    public void getBookInfo(String isbn) {
        Book book = books.get(isbn);
        if (book != null) {
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Status: " + book.getStatus());
        } else {
            System.out.println("Book not foound!");
        }
    }

    //list all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Not books in the library");
        }
        for (Book book : books.values()) {
            System.out.println("*"+ book.getIsbn() + " - " + book.getTitle() + " - " + book.getAuthor());
        }
    }
}