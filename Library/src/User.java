public class User extends People {
    private int id;

    public User(int id, String name, String surname, int age) {
        super(name, surname, age);
        this.id = id;
    }

    public User(String name, String surname, int age) {
        super(name, surname, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void takeBook(){

    }
}
