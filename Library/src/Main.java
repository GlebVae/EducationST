import com.softteco.library.Library;
import com.softteco.users.Librarian;
import com.softteco.users.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Добро пожаловать в библиотеку Libra!");
        User userOne = new User (1, "Artem", "Lopatin", 25);
        Library libraryZor = new Library("Zorka", 7);
        Librarian librarianZin = new Librarian("Zinaida", "Petrovna", 45,"First");

        librarianZin.setLibrary(libraryZor);
        libraryZor.setLibrarian(librarianZin);
        userOne.setLibrary(libraryZor);
        libraryZor.setUserOne(userOne);

//        librarianZin.sayHello();

        Scanner sc = new Scanner(System.in);
        System.out.println("Показать все книги в библиотеке?(yes/no): ");
        if (sc.hasNext("yes")){
            System.out.println("Печально, но это всё, что у нас есть:");
            librarianZin.findAllBooks(1);

            sc.nextLine();
            System.out.println(" ");
            System.out.println("Хотите что-то выбрать?(yes/no) ");
            if (sc.hasNext("yes")){
                sc.nextLine();
                System.out.println("Укажите ID книги: ");
                if (sc.hasNext("1")){
                    librarianZin.searchIDBook();
                }

            }else {
                System.out.println("Надо больше читать");
            }
        }else {
            System.out.println("Зря-зря");
        }




        }
    }

