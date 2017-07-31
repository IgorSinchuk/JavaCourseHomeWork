package prog.kiev.ua.homework.Module3.Hardware;

/**
 * Created by igorsinchuk on 7/29/17.
 */
public class CPU {
    private int frequency = 20;
    private boolean power;

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getFrequency() {
        return frequency;
    }
}
