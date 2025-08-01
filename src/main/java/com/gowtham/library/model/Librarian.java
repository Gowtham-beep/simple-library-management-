package com.gowtham.library.model;

public class Librarian extends User{
    public Librarian(String name){super(name);}
    @Override
    public String getRole(){return "Librarian";}

}