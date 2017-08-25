package prog.kiev.ua.homework.Module11.Multithreading;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class FactorialThread implements Runnable{
    private int k;
    private int i;

    public FactorialThread(int k, int i) {
        this.k = k;
        this.i = i;
    }

    @Override
    public void run() {
        Factorial.calculateFactorialToFile(k, i);
    }
}
