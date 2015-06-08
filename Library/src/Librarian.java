import java.util.ArrayList;

public class Librarian extends People {
    private String permitions;
    private Librarian librarian;

    public  Librarian(String name, String surname, int age, String permitions) {
        super(name, surname, age);
        this.permitions = permitions;
    }

    public String getPermitions() {
        return permitions;
    }

    public void setPermitions(String permitions) {
        this.permitions = permitions;
    }

    public boolean findBook(String name){

        for (int i = 0; i < 5; i++) {
            
        }

        return true;

    }}




