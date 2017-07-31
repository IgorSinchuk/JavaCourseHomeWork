package prog.kiev.ua.homework.Module3.TaxiHW;

/**
 * Created by igorsinchuk on 7/30/17.
 */
public class Runner {

    public static void main(String[] args) {

        TaxiRate rate = new StandardRate();

        TaxiRide taxiRide1 = new TaxiRide(1 , 2 , 3,rate);

        TaxiRides taxiRides = new TaxiRides();
        taxiRides.add(taxiRide1);


        StandardRate standardRate = new StandardRate();
        FamilyRate familyRate = new FamilyRate();

        System.out.println(taxiRides.getPrice(new StandardRate()));
        System.out.println(taxiRides.getPrice(new FamilyRate()));
    }
}