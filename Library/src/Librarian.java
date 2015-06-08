public class Librarian extends People {
    private String permitions;

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

    public String giveBook(String name){
        return null;
    }

    public boolean findBook(){
        Library library = new Library("Zorka", "7");
        Book books;
        for (int i = 0; i < 5; i++){

        }

        return Boolean.parseBoolean(null);
    }
}
