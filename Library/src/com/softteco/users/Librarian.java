package com.softteco.users;
import com.softteco.library.Library;
import com.softteco.library.Book;
import java.util.ArrayList;


public class Librarian extends People {

    private String permitions;
    private Library library;
    private Book book;

    public Librarian(String name, String surname, int age, String permitions) {
        super(name, surname, age);
        this.permitions = permitions;
    }

    public String getPermitions() {
        return permitions;
    }

    public void setPermitions(String permitions) {
        this.permitions = permitions;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book getBook() {
        return book;
    }
    //    public void sayHello(){
//        System.out.println("heheeleleo");
//    }

    public boolean findAllBooks(int idBook) {
        ArrayList<Book> books = library.getBooks();
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        return true;
    }

    public void searchIDBook() {
        ArrayList<Book> books = library.getBooks();
        int idBook = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.contains(idBook))
            books.get(idBook);
            System.out.println("Мы нашли Вашу книгу " + books.get(idBook));
                break;
            }
        }

    }


