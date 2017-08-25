package prog.kiev.ua.homework.Module11.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class MultiThread {
    private MultiThread() {
    }

    public static void runFactorialThread(int k, int n) {
        long begin = System.currentTimeMillis();
        ExecutorService executorService = newFixedThreadPool(n);

        for (int i = 1; i <= n; i++) {
            executorService.submit(new FactorialThread(k,i));
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("100 thread: " + TimeUnit.MILLISECONDS.toSeconds(end-begin) + " seconds.");
    }
}
