public class World {

    public static void main (String[] args){

        User user = new User("Артём", "Лопатин", 25);
        user.request();


        Librarin librarin = new Librarin("Зинаида", "Петровна", 53);
        librarin.getaBook();

        Library library = new Library();


        Book book = new Book();
    }
}
