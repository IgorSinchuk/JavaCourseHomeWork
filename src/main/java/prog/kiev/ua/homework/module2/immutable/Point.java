package prog.kiev.ua.homework.module2.immutable;

/**
 * Created by igorsinchuk on 7/26/17.
 */
public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    protected Point clone() {
        return new Point(x, y);
    }

}
