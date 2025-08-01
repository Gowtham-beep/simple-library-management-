package com.gowtham.library;
import com.gowtham.library.model.*;
import com.gowtham.library.service.LibraryService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
    LibraryService library= new LibraryService();
    Book book = new Book("ISBN213","Hard things about Hard things","Ben horowitz");
    library.addBook(book);
    library.getBookInfo("ISBN213");
    library.listBooks();

    User u1= new Student("Gowtham");
    System.out.println("The user role: "+u1.getRole());
     library.borrowBook("ISBN213","Gowtham");


    }
}


