package prog.kiev.ua.homework.Module3.TaxiHW;

/**
 * Created by igorsinchuk on 7/30/17.
 */
public class FamilyRate implements TaxiRate{

    public long calculatePrice(TaxiRide ride) {
        return 50 + 20 * ride.getDistance()/ride.getPassengers();
    }
}
