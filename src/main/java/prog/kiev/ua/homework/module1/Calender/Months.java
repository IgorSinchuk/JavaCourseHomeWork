package prog.kiev.ua.homework.module1.Calender;

import java.util.Scanner;

/**
 * Created by igorsinchuk on 7/18/17.
 */
public class Months {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 12");

        final String command = scanner.nextLine();

        switch (command) {
            case "1":
                System.out.println("January");
                break;
            case "2":
                System.out.println("February");
                break;
            case "3":
                System.out.println("March");
                break;
            case "4":
                System.out.println("April");
                break;
            case "5":
                System.out.println("May");
                break;
            case "6":
                System.out.println("June");
                break;
            case "7":
                System.out.println("July");
                break;
            case "8":
                System.out.println("August");
                break;
            case "9":
                System.out.println("September");
                break;

            case "10":
                System.out.println("October");
                break;

            case "11":
                System.out.println("November");
                break;

            case "12":
                System.out.println("December");
                break;

            default:
                System.out.println("Unknown number or : '" + command + "'");
        }
    }
}
