package com.softteco.library;


public class Book {
    private int idBook;
    private String nameBook;
    private String authorName;

    public Book(int idBook, String nameBook, String authorName) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.authorName = authorName;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book[ID: " + idBook + ", bookname: " + nameBook + ", authorbook: " + authorName + "]";
    }
}
