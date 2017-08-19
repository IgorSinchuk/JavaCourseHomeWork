package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/15/17.
 */
public class Seat {
    int seatNumber;
    boolean isReserved;

    public Seat(int seatNumber,boolean isReserved) {
        this.seatNumber = seatNumber;
        this.isReserved = isReserved;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public boolean getReservationStatus() {
        return isReserved;
    }

    public void reserved() {
        isReserved  = true;
    }

    public void notReserved() {
        isReserved = false;
    }
}

