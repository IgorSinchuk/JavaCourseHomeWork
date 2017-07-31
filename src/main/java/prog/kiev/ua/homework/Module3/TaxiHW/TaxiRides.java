package prog.kiev.ua.homework.Module3.TaxiHW;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igorsinchuk on 7/31/17.
 */
public class TaxiRides {
    private List<TaxiRide> taxiRides = new ArrayList<>();

    public void add(TaxiRide taxiRide) {
        taxiRides.add(taxiRide);
    }

    public long getPrice (TaxiRate taxiRate) {
        long price = 0;
        for (TaxiRide ride : taxiRides) {
            price += taxiRate.calculatePrice(ride);

        }
        return price;
    }

}
