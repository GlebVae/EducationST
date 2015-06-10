import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        System.out.println("Добро пожаловать в библиотеку Libra!");
        Library libraryZor = new Library("Zorka", 7);
        Librarian librarianZin = new Librarian("Zinaida", "Petrovna", 45,"First");

        librarianZin.setLibrary(libraryZor);
        libraryZor.setLibrarian(librarianZin);

//        librarianZin.sayHello();

        Scanner sc = new Scanner(System.in);
        System.out.println("Показать все книги в библиотеке?(yes/no): ");
        if (sc.hasNext("yes")){
            System.out.println("Печально, но это всё, что у нас есть:");
            librarianZin.findBook(1);
        }
        if (sc.hasNext("Yes")){
            System.out.println("Печально, но это всё, что у нас есть:");
            librarianZin.findBook(1);
        }else {
            System.out.println("Зря-зря");
        }


    }
}
