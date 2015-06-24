package com.softteco.users;

import java.util.ArrayList;
import com.softteco.library.Book;
import com.softteco.library.Library;

public class User extends People {

    private int id;
    private Library library;
    private Librarian librarian;
    private Book book;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public User(int id, String name, String surname, int age) {
        super(name, surname, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void askBook(int idBook){

        }
    }

