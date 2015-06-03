public class Librarian extends People {

    public static void main (String[] args){
        Librarian one = new Librarian();
        one.setFname("Зинаида");
        one.setSname("Петровна");
        one.setAge(56);
        System.out.println("Привет меня зовут " + one.getFname() + " " + one.getSname() + " и сегодня я Ваш библиотекарь");
    }
}
