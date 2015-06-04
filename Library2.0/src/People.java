public class People {

    private String Name;
    private String Surname;
    private int Age;

    protected void setName(String name){ this.Name = name; }
    protected String getName(){ return this.Name; }

    protected void setSurname(String surname){ this.Surname = surname; }
    protected String getSurname(){ return this.Surname; }

    protected void setAge(int age){
        if (age > 0){
            this.Age = age;
        }else {
            System.out.println("Значение возраста не может быть меньше нуля");
        }
        }
    protected int getAge(){ return this.Age; }

}
