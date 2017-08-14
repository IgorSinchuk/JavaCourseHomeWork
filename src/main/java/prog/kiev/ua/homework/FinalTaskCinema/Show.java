package prog.kiev.ua.homework.FinalTaskCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/9/17.
 */
public class Show {

    private String showName;
    private String showDate;
    private Theatre theatre;
//    private List<Cast>
//    private ArrayList<Seat> seats;
//    private int freeSeats;

    public Show(String showName, String showDate, Theatre theatre) {
        this.showName = showName;
        this.showDate = showDate;
        this.theatre = theatre;
    }

//    public void loadSeats()
//    {
//        for (Row row : theatre.getRows())
//        {
//            for (Seat seat : row.getSeats())
//            {
//                seats.add(seat);
//            }
//        }
//    }
//
//    public int getFreeSeatsCount() {
//        for (Seat seat : seats) {
//            if (!seat.getReservationStatus()) {
//                freeSeats++;
//            }
//        }
//        return freeSeats;
//    }

//    public void setShow(String showName) {
//        this.showName = showName;
//    }
//
//    public void setShowDate(String showDate) {
//        this.showDate = showDate;
//    }

    public String getShowName() {
        return showName;
    }

    public String getShowDate() {
        return showDate;
    }

    public Theatre getTheatre() {
        return theatre;
    }

//    public ArrayList<Seat> getSeats() {
//        return seats;
//    }

}