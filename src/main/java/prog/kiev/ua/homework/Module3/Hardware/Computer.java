package prog.kiev.ua.homework.Module3.Hardware;

/**
 * Created by igorsinchuk on 7/28/17.
 */
public class Computer {

    private HDD hdd;
    private ODD odd;
    private RAM ram;
    private CPU cpu;


    public Computer(HDD hdd, ODD odd, RAM ram, CPU cpu) {
        this.hdd = hdd;
        this.odd = odd;
        this.ram = ram;
        this.cpu = cpu;
    }

    public void powerOn() {
        this.cpu.setPower(true);
    }

    public void powerOff() {
        this.cpu.setPower(false);
    }

    public int virusCheck() {
        return this.hdd.getCheckVirus();
    }

    public void virusRemove() {
        this.hdd.setCheckVirus(0);
    }

    public void printToConsole() {
        System.out.println("HDD: " + this.hdd.getCapacity() + "mb");
    }

    public boolean computerIsOn() {
        return this.cpu.isPower();
    }
}
