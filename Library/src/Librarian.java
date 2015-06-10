import java.util.ArrayList;

public class Librarian extends People {

    private String permitions;
    private Library library;

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

//    public void sayHello(){
//        System.out.println("heheeleleo");
//    }

    public boolean findBook(int idBook){
        ArrayList<Book> books = library.getBooks();
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
        return true;
    }


}
