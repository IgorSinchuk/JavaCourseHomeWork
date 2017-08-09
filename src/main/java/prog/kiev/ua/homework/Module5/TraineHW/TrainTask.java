package prog.kiev.ua.homework.Module5.TraineHW;

/**
 * Created by igor on 8/9/17.
 */
public class TrainTask implements Train{

    private boolean light;
    private int count = 0;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void turnLeft() {
        count--;
    }

    @Override
    public void turnRight() {
        count++;
    }

    @Override
    public void lightOn() {
        light = true;
    }

    @Override
    public void lightOff() {
        light = false;
    }

    @Override
    public boolean isLightOn() {
        return light;
    }

    @Override
    public boolean isLength(int expectedLength) {
        for (int i = 0; i < expectedLength; i++) {
            this.turnLeft();
        }
        return !light;
    }
}
