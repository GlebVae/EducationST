package com.softteco.library;
import java.util.ArrayList;
import com.softteco.users.Librarian;
import com.softteco.users.User;


public class Library {
    private String name;
    private int numberOfRooms;
    private Librarian librarian;
    private User userOne;

    public User getUserOne() {
        return userOne;
    }

    public void setUserOne(User userOne) {
        this.userOne = userOne;
    }

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;

        Book one = new Book(1, "Герои нашего времени", "Лермонтов");
        books.add(one);
        Book two = new Book(2, "Гарри Поттер и филосовский камень", "Роулинг");
        books.add(two);
        Book three = new Book(3, "Меч Предназначения", "Сапковский");
        books.add(three);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}


