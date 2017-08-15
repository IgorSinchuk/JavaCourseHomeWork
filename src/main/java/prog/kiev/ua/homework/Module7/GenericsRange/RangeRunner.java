package prog.kiev.ua.homework.Module7.GenericsRange;

/**
 * Created by igor on 8/15/17.
 */
public class RangeRunner {

    public static void main(String[] args) {
        Range<Integer> integerRange = new Range<>(48, 79);
        System.out.println(integerRange.toString());
    }


}
