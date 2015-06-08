public class User extends People {
    private int id;
    private boolean delay = false;
    private boolean noobie = false;

    public User(String name, String surname, int age, int id, boolean delay, boolean noobie) {
        super(name, surname, age);
        this.id = id;
        this.delay = delay;
        this.noobie = noobie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDelay() {
        return delay;
    }

    public void setDelay(boolean delay) {
        this.delay = delay;
    }

    public boolean isNoobie() {
        return noobie;
    }

    public void setNoobie(boolean noobie) {
        this.noobie = noobie;
    }
}
