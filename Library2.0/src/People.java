public class People {

    private String Name;
    private String Surname;
    private int Age;

    public void setName(String name){ this.Name = name; }
    public String getName(){ return this.Name; }

    public void setSurname(String surname){ this.Surname = surname; }
    public String getSurname(){ return this.Surname; }

    public void setAge(int age){
        if (age > 0){
            this.Age = age;
        }else {System.out.println("Значение возраста не может быть меньше нуля");}
        }
    public int getAge(){ return this.Age; }

}
