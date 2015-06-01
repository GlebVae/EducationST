// Проба цикла
public class DoWhile {

    public static void main (String [] args){
        int x = 8;
        while (x > 4) {
            x = x -1;
            System.out.println("x равен " + x);
        }
        int z = 27;
        while (z == 17);
        System.out.println("z ничоси не работает, ведь Z = " + z);
    }
}
//ещё чуть чуть попыток
class Loop {
    public static void main (String [] args){
        int x = 1;
        System.out.println("Перед началом цикла");
        while (x < 4){
            System.out.println("Внутри цикла");
            System.out.println("Значение x равно " + x);
            x = x + 1;
        }
        System.out.println("После окончания цикла");
    }

}