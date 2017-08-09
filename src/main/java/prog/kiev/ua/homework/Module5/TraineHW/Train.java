package prog.kiev.ua.homework.Module5.TraineHW;

/**
 * Created by igor on 8/9/17.
 */
public interface Train {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);

    int getCount();
    void setCount(int count);
}
