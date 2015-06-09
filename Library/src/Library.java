public class Library {
    private String name;
    private String numberOfRooms;
    private Book[] books;
    private UserCard[] usercards;
    // В библиотеке работает определенный библиотекарь
    private Librarian librarian;


    public Library(String name, String numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;

        books = new Book[5];
        books[0] = new Book(1, "Герои нашего времени", "Лермонтов");


        usercards = new UserCard[5];
        usercards[0] = new UserCard("Artem","Lebedev", 25, "Kosmos 3-1-2", "222-555-678", 1);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public UserCard[] getUsercards() {
        return usercards;
    }

    public void setUsercards(UserCard[] usercards) {
        this.usercards = usercards;
    }

    // Узнаем какой библиотекарь работает в библиотеке
    public Librarian getLibrarian() {
        return librarian;
    }
    // Устраиваем на работу в определённую библиотеку
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
}

