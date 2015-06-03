public class User extends People{

    public User(String name, String surname, int age){
        super.setName(name);
        super.setSurname(surname);
        super.setAge(age);
    }

    public static void main (String[] args){
        User user = new User("Артём", "Лопатин", 25);

    }

}