package prog.kiev.ua.homework.FinalTaskCinemaV2;

/**
 * Created by igor on 8/14/17.
 */
public class Booking {

    int rowNumber;
    int seatNumber;
    Cinema cinema;

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean reservedSeat(int selectedRow, int selectedSeat) {
        if (cinema.getCinema().getRows().get(rowNumber).getSeats() == 1) {

        }
    }
}
