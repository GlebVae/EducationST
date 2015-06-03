public class Librarin extends People{

    public Librarin(String name, String surname, int age){
        super.setName(name);
        super.setSurname(surname);
        super.setAge(age);
       }
    //присваиваем имя
    public void newname(){
        Librarin librarin = new Librarin("Зинаида", "Петровна", 53);
    }
    //просто так
    public void say(){
        System.out.println("Привет меня зовут " + getName() + " " + getSurname() + " и сегодня я Ваш библиотекарь");
    }

}
