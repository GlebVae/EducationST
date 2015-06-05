public class World {
    static User user = new User("Artem", "Lopatin", 25);

    public static void main (String [] args){

        user.takeBookId(1);
        user.takeBookName("Герои нашего времени");
        user.takeBookAuthor("Лермонтов");
        user.returnBook();


    }
}
