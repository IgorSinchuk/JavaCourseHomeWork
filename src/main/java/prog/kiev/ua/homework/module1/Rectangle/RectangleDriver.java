package prog.kiev.ua.homework.module1.Rectangle;

/**
 * Created by igorsinchuk on 7/20/17.
 */
public class RectangleDriver {

    public static void main(String[] args) {
        Rectangle Rectangle = new Rectangle();

        Rectangle.setPerimeter((6+4)*2);
        Rectangle.setArea(6*4);

        System.out.println("Area: " + Rectangle.getPerimeter());
        System.out.println("Perimeter: " + Rectangle.getArea());
    }
}
