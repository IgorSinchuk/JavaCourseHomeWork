package prog.kiev.ua.homework.Module11.Multithreading;

import java.io.*;
import java.math.BigInteger;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class Factorial {
    private Factorial() {
    }

    public static BigInteger calculateFactorial(int value) {
        if (value < 0) throw new IllegalArgumentException();
        if (value == 0 || value == 1)
            return BigInteger.ONE;

        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= value; i++ ) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }

    public static void calculateFactorialToFile (int k, int i) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Factorial["+k+"x"+i+"].txt"))) {
            writer.write(calculateFactorial(k*i).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
