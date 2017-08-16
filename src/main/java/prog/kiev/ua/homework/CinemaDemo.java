package prog.kiev.ua.homework;

import java.util.Scanner;

/**
 * Created by igor on 8/16/17.
 */
public class CinemaDemo {

    static final Scanner scanner = new Scanner(System.in);
    static String name;
    static String[] movieList = {"1) The Avaengers", "2) SAW", "3) Promethius", "4) The Simpsons"};
    static int number;


    public static void getName() {
        System.out.println("inmupt your name");
        name = scanner.nextLine();
        System.out.println("Hi" + name);
        getMovie();
    }

    public static void getMovie() {
        System.out.println("select movie");
        for (int i=0; i<movieList.length;i++) {
            System.out.println(movieList[i]);
        }
        number = scanner.nextInt();
        System.out.println("selected" + movieList[number-1].substring(3, movieList[number].length()));
        getSeats();
    }

    public static void getSeats() {
        System.out.println("choose seat");
        String seats = scanner.next();
        System.out.println("seats have selected"+seats + "for movie" + movieList[number-1].substring(3, movieList[number].length()));
    }

    public static void main(String[] args) {
        getName();
    }
}
