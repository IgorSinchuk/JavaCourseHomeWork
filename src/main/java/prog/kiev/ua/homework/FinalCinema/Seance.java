package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/15/17.
 */
public class Seance {

    int ticketPrice;
    int rowNumber;
    int seatNumber;
    long seanceDate;
    private List<Movie> movies = new ArrayList<>();
    private List<Seance> seanceList = new ArrayList<>();


    public Seance(int rowNumber, int seatNumber, long seanceDate, int ticketPrice) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.seanceDate = seanceDate;
        this.ticketPrice = ticketPrice;
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

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public List<String> getSeanceType() {
        return getSeanceType();
    }

    public long getSeanceDate() {
        return seanceDate;
    }

    }
