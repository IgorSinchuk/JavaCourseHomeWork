package prog.kiev.ua.homework.Module3.TaxiHW;

/**
 * Created by igorsinchuk on 7/30/17.
 */
public class TaxiRide {
    private int passengers;
    private long distance;
    private long duration;
    private TaxiRate rate;


    public TaxiRide() {

    }

    public TaxiRide(long duration, long distance, TaxiRate rate) {

        passengers = 1;
        this.distance = distance;
        check(distance);
        this.duration = duration;
        check(duration);
        rate = rate;

    }


    public TaxiRide(int passengers, long distance, long duration, TaxiRate rate) {
        this.passengers = passengers;
        check(passengers);
        this.distance = distance;
        check(distance);
        this.duration = duration;
        check(duration);
        rate = rate;
    }

    public int getPassengers() {
        return passengers;
    }

    public long getDistance() {
        return distance;
    }

    public long getDuration() {
        return duration;
    }

    public long getPrice() {
        return rate.calculatePrice(this);
    }

    public String toString() {
        return "Ride\nduration:" + this.duration + "min\ndistanse" + this.distance
                + "km\n" + "price " + getPrice() +"$ \n";
    }

    private void check(int passengers) {
        if (passengers<0) {
            System.out.println("This value can`t equal 0!");
        }
    }

    private void check(long value) {
        if (value<0) {
            System.out.println("This value can`t equal 0!");
        }
    }
}
