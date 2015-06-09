public class Library {
    private String name;
    private int numberOfRooms;
    private Librarian librarian;
    private Book[] books;

    public Library(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;

        books = new Book[5];
        books[0]= new Book(1,"Герои нашего времени","Лермонтов");
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

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
