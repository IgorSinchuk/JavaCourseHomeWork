package prog.kiev.ua.homework.module2.immutable;

/**
 * Created by igorsinchuk on 7/26/17.
 */
public class Runner {
    public static void main(String[] args) {
        Lines lines = new Lines();

        lines.add(new Line(new Point(-20, -20), new Point(20, 20)));
        lines.add(new Line(new Point(-20, -20), new Point(20, 20)));
        lines.add(new Line(new Point(-20, -20), new Point(20, 20)));

        System.out.println(lines.toString());
        System.out.println("Longest line: " + lines.longestLine());
        System.out.println("Summary length: " + lines.sumLength());
    }
}
