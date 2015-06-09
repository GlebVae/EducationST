import java.util.ArrayList;

public class Librarian extends People {
    private String permitions;
    Library library;
    Book book;

    public  Librarian(String name, String surname, int age, String permitions) {
        super(name, surname, age);
        this.permitions = permitions;
    }

    public String getPermitions() {
        return permitions;
    }

    public void setPermitions(String permitions) {
        this.permitions = permitions;
    }


    public boolean findBook() {
        Book[]books = library.getBooks();
        for (int i = 0; i < books.length; i++) {
    }
        return true;
    }

}




