package prog.kiev.ua.homework.Module3.TaxiHW;

/**
 * Created by igorsinchuk on 7/30/17.
 */
public class Runner {

    public static void main(String[] args) {

        TaxiRate rate = new StandardRate();
        TaxiRate rate1 = new FamilyRate();
        TaxiRide taxiRide1 = new TaxiRide(1 , 2 , 3,rate);
        TaxiRide taxiRide2 = new TaxiRide(4 , 5 , 6,rate);
        TaxiRide taxiRide3 = new TaxiRide(7 , 8 , 9,rate);

//        TaxiRide rides = new TaxiRides();
//        rides.

    }
}