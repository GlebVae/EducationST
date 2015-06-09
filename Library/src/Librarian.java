public class Librarian extends People {
    private String permitions;
    // Бибилотекарь работает в определенной библиотеке
    private Library library;


    public Librarian(String name, String surname, int age, String permitions) {
        super(name, surname, age);
        this.permitions = permitions;
    }
    // Спросить в какой библиотеке ты работаешь
    public Library getLibrary() {
        return library;
    }
    // Указать в какой библиотеке будешь работать
    public void setLibrary(Library library) {
        this.library = library;
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
            System.out.println(books[i]);

    }
        return true;
    }
    public void sayHello(){
        System.out.println("heloeleoeleo");
    }
}




