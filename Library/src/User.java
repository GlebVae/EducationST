public class User extends People{

    public static void main (String[] args){
        User one = new User();  //**тут можно было создать массив пользователей ?
        one.setFname("Артем");
        one.setSname("Лопатин");
        one.setAge(26);
        System.out.println("Добрый день! Меня зовут " + one.getFname() + " " + one.getSname() + " и я хочу быть пользователем." );
    }
}
