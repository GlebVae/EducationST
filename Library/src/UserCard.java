
public class UserCard extends People {
    private String address;
    private String phone;
    private int id;

    public UserCard(String name, String surname, int age, String address, String phone, int id) {
        super(name, surname, age);
        this.address = address;
        this.phone = phone;
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
