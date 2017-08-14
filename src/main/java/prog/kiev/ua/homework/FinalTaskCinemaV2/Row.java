package prog.kiev.ua.homework.FinalTaskCinemaV2;

import java.util.ArrayList;


/**
 * Created by igor on 8/14/17.
 */
public class Row {
    private ArrayList<Seat> seats;
    private int rowNumber;
    private int rowClass;
    private int seatCount;

    public Row(int rowNumber, int rowClass, int seatCount) {
        this.seats = seats;
        this.rowNumber = rowNumber;
        this.rowClass = rowClass;
        this.seatCount = seatCount;
        seats = new ArrayList<>();
        createSeats(this.seatCount);
    }

    public int getRowClass() {
        return this.rowClass;
    }

    public void setRowClass(int rowClass) {
        this.rowClass = rowClass;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void createSeats(int seatCount) {
        for (int i = 0; i <= seatCount; i++) {
            seats.add(new Seat(false, i));
        }
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }
}
