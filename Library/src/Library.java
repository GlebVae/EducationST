public class Library {
    private String name;
    private String numberOfRooms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public Library(String name, String numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        Book[] books;
        books = new Book[5];
        books[0] = new Book(1, "Герои нашего времени", "Лермонтов");

        UserCard[] usercards;
        usercards = new UserCard[5];
        usercards[0] = new UserCard("Artem","Lebedev", 25, "Kosmos 3-1-2", "222-555-678", 1);

    }



}
