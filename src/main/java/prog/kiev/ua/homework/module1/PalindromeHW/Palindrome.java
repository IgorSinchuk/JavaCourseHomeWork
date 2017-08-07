package prog.kiev.ua.homework.module1.PalindromeHW;

import java.util.Scanner;

/**
 * Created by igorsinchuk on 7/31/17.
 */
public class Palindrome {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = Integer.parseInt(scanner.nextLine());

        int n = num;
        int rev = 0;

        for (int i = 0; i <= num; i++) {
            int r = num % 10;
            num = num /10;
            rev = (rev * 10) + r;
            i= 0;
        }

        if (n == rev) {
            System.out.println(n + " is palindrome");
        } else {
            System.out.println(n + " is not palindrome");
        }

    }
}
