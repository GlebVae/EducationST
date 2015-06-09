public class User extends People {
    private int id;

    public User(String name, String surname, int age, int id) {
        super(name, surname, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
