public class Book {
    private int idBook;
    private String nameBook;
    private String authorBook;

    public Book(int idBook, String nameBook, String authorBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
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

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }


}
