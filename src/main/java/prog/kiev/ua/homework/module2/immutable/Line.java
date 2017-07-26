package prog.kiev.ua.homework.module2.immutable;

/**
 * Created by igorsinchuk on 7/26/17.
 */
public class Line {

    private final Point start;
    private final Point end;

    public Line(Point start, Point finish) {
        this.start = start.clone();
        this.end = finish.clone();
    }

    double getLength() {
        return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2));
    }




}
