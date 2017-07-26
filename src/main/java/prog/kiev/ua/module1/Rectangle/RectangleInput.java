package prog.kiev.ua.module1.Rectangle;

import java.util.Scanner;

/**
 * Created by igorsinchuk on 7/18/17.
 */
public class RectangleInput {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Hi. I m going to calculate perimeter & area of rectangle");
        System.out.println("Please enter height and width");
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();

        double perimeter = (height + width) * 2;


        System.out.println("Now it s time for area. Please enter height and width");

        double height2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();

        double area = (height2 * width2);
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
    }