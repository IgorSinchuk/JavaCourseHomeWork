package prog.kiev.ua.homework.Module7.GenericsPair;

/**
 * Created by igor on 8/15/17.
 */
public class Pair< L, R> {
    private final L left;
    private final R right;

    public Pair(L left, R riight) {
        this.left = left;
        this.right = riight;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Range{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }


}
