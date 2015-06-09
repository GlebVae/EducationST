
public class Main {

    public static void main(String[] args){
        Library libraryZor = new Library("Zorka", 7);
        Librarian librarianZin = new Librarian("Zinaida", "Petrovna", 45,"First");

        librarianZin.setLibrary(libraryZor);
        libraryZor.setLibrarian(librarianZin);

        librarianZin.sayHello();
        librarianZin.findBook(1);

    }
}
