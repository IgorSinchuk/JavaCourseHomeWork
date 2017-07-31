package prog.kiev.ua.homework.Module3.TaxiHW;

/**
 * Created by igorsinchuk on 7/30/17.
 */
public class StandardRate implements TaxiRate {

    public long calculatePrice(TaxiRide ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
        }
}
