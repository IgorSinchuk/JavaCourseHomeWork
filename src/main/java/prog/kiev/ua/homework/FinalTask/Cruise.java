package prog.kiev.ua.homework.FinalTask;

import java.util.List;
import java.util.Map;

/**
 * Created by igor on 8/7/17.
 */
public class Cruise {

    private String cruiseNumber;
    private String numberOfCabins;
    private String pricePerCabin;
    private String destination;

    private Map<Passenger, ResitvationItem> resitvationItemMap;

    List<Integer> cabinPool;
}
