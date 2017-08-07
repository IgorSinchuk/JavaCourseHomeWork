package prog.kiev.ua.homework.FinalTask;

/**
 * Created by igor on 8/7/17.
 */
public enum CruiseCSVEnum {

    CRUISE_NUMBER,
    DESTINATION,
    PRICE_PER_CABIN,
    NUMBER_OF_CABINS;

    private final int index;


    CruiseCSVEnum(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
