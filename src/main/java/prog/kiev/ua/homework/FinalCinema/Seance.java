package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/15/17.
 */
public class Seance {

    int rowNumber;
    int seatNumber;
    private List<String> seanceType = new ArrayList<>();



    public Seance(int rowNumber, int seatNumber) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public List<String> getSeanceType() {
        return getSeanceType();
    }

    public void bookingSystem(int rowNumber, int seatNumber) {

    }
}
