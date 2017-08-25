package prog.kiev.ua.homework.Module11.Multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class Runner {
    public static final int N = 100;
    public static final int K = 1000;

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            Factorial.calculateFactorialToFile(K, i);
        }

        long end = System.currentTimeMillis();
        System.out.println("One thread: " + TimeUnit.MILLISECONDS.toSeconds(end-begin)+ " seconds.");
        MultiThread.runFactorialThread(K, N);
    }
}
