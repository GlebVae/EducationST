public class User extends People {

    public User (String name, String surname, int age){
        super.setName(name);
        super.setSurname(surname);
        super.setAge(age);
    }

    public void takeBookId (int id){}
    public void takeBookName (String bookName){}
    public void takeBookAuthor (String bookAuthor){}
    public void returnBook(){}



}
