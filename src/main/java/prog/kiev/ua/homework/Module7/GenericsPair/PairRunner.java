package prog.kiev.ua.homework.Module7.GenericsPair;

/**
 * Created by igor on 8/15/17.
 */
public class PairRunner {
    public static void main(String[] args) {
        Pair <Integer, String> pair = new Pair<>(10, " is ten.");
        System.out.println(pair);

        Pair <Pair, Integer> pair1 = new Pair<>(new Pair(50, "Right."), 10);
        System.out.println(pair1);
    }
}