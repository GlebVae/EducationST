public class World {


    public static void main(String[] args){
        Librarian librarian1 = new Librarian("Zinaida", "Petrovna", 45,"First");
        Library library1 = new Library("Zorka", "7");

        librarian1.setLibrary(library1);
        library1.setLibrarian(librarian1);

       librarian1.findBook();

        librarian1.sayHello();



    }}

