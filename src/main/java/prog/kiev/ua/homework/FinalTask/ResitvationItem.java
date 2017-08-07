package prog.kiev.ua.homework.FinalTask;

/**
 * Created by igor on 8/7/17.
 */
public class ResitvationItem {

    private Passenger passenger;
    private int price;
    private int cabinNumber;

    public ResitvationItem(Passenger passenger, int price, int cabinNumber) {
        this.passenger = passenger;
        this.price = price;
        this.cabinNumber = cabinNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public int getPrice() {
        return price;
    }

    public int getCabinNumber() {
        return cabinNumber;
    }
}
