package prog.kiev.ua.homework.FinalTaskCinema;

/**
 * Created by igor on 8/9/17.
 */
public class Booking {

    int cost;
    Customer customer;
    Show show;
    int rowNumber;
    int seatNumber;

    public Booking(Customer customer, Show show) {
        this.customer = customer;
        this.show = show;
    }

    public int getCost() {
        if (show.getTheatre().getRows().get(rowNumber).getRowClass() == 1) {
            return cost += 8;
        } else {
            return cost += 5;
        }
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean reservedSeat(int selectedRow, int selectedSeat) {
        if (show.getTheatre().getRows().get(selectedRow).getSeats().get(selectedSeat).getReservationStatus()) {
            return false;
        } else {
            show.getTheatre().getRows().get(selectedRow).getSeats().get(selectedSeat).reserved();
            setRowNumber(selectedRow);
            setSeatNumber(selectedSeat);
            return true;
        }
    }

    public boolean notReservedSeat() {
        show.getTheatre().getRows().get(rowNumber).getSeats().get(seatNumber).notReserved();
        return true;
    }

    public Customer getCustomer() {
        return customer;
    }
}
