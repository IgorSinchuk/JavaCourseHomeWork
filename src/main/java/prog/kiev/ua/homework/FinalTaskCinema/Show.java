package prog.kiev.ua.homework.FinalTaskCinema;

import java.util.ArrayList;

/**
 * Created by igor on 8/9/17.
 */
public class Show {

    private String showName;
    private String showDate;
    private String theatre;
    private ArrayList<Seat> seats;
    private int freeSeats;

    public Show(String showName, String showDate, String theatre) {
        this.showName = showName;
        this.showDate = showDate;
        this.theatre = theatre;
    }

    public int getFreeSeatsCount() {
        for (Seat seat : seats) {
            if (!seat.getReservationStatus()) {
                freeSeats++;
            }
        }
        return freeSeats;
    }

    public void setShow(String showName) {
        this.showName = showName;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowName() {
        return showName;
    }

    public String getShowDate() {
        return showDate;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

}
