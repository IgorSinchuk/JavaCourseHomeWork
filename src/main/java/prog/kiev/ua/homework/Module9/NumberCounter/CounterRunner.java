package prog.kiev.ua.homework.Module9.NumberCounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static prog.kiev.ua.homework.Module9.NumberCounter.Numbers.counterRunner;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class CounterRunner {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 40, 30, 99, 18, 99, 7, 67, 43, 9, 7, 5, 9, 59, 40, 5, 11, 99);
        Map<Integer, Integer> integerMap = new HashMap<>();
        counterRunner(integerList, integerMap);
        System.out.println(integerMap);

}
}
