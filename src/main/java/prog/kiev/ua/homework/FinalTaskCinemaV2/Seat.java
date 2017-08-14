package prog.kiev.ua.homework.FinalTaskCinemaV2;

/**
 * Created by igor on 8/14/17.
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
