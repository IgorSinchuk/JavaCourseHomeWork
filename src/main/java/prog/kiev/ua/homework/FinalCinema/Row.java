package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Created by igor on 8/15/17.
 */
public class Row {

    private ArrayList<Seat> seats;
    private int rowNumber;
    private int seatCount;

    public Row(ArrayList<Seat> seats, int rowNumber, int seatCount) {
        this.seats = seats;
        this.rowNumber = rowNumber;
        this.seatCount = seatCount;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void createSeats( int seatCount) {
        for (int i = 0; i <= seatCount; i++) {
            seats.add(new Seat(0, false));
        }
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }
}
