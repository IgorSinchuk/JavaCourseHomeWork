package prog.kiev.ua.homework.Module5.TraineHW;

/**
 * Created by igor on 8/9/17.
 */
public class CarriageCounter {
    public static int findLength(Train train) {
        if (!train.isLightOn()) {
            train.lightOn();
        }
        train.turnRight();
        train.setCount(train.getCount()+1);

        while (!train.isLength(train.getCount())) {
            if (!train.isLightOn()) {
                train.turnRight();
            } else {
                train.lightOff();
            }
            train.setCount(train.getCount()+1);
        }
        return train.getCount()+1;
    }

    public static void main(String[] args) {

        Train train = new TrainTask();
        int trainLength = findLength(train);
    }
}
