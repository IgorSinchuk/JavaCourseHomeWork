package prog.kiev.ua.homework.Module9.NumberCounter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class Numbers {
    public static void counterRunner(List<Integer> integersList, Map<Integer, Integer> integerMap) {
        Iterator iterator = integersList.iterator();
        while (iterator.hasNext()) {
            Integer next = (Integer) iterator.next();
            Integer value = integerMap.get(next);
            integerMap.put(next, (value == null) ? 1 : value + 1);
        }
    }
}
