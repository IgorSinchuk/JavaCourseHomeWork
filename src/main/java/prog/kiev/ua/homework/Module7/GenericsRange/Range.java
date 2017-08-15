package prog.kiev.ua.homework.Module7.GenericsRange;

/**
 * Created by igor on 8/15/17.
 */
class Range <T extends Number & Comparable<T>> {

    private final T lowerValue;
    private final T upperValue;

    public Range(T lowerValue, T upperValue) {
        this.lowerValue = lowerValue;
        this.upperValue = upperValue;
    }

    public T getLowerValue() {
        return lowerValue;
    }

    public T getUpperValue() {
        return upperValue;
    }

    @Override
    public String toString() {
        return "RangeRunner{" +
                "lowerValue=" + lowerValue +
                ", upperValue=" + upperValue +
                '}';
    }

}
