public class People {
    private String name;
    private String surname;
    private int age;

    protected void setName(String name){
        this.name = name;
    }
    protected String getName(){
        return this.name; }

    protected void setSurname(String surname){
        this.surname = surname;
    }
    protected String getSurname(){
        return this.surname;
    }
    protected void setAge(int age){
        this.age = age;
    }
    protected int getAge(){
        return this.age;
    }

}
