package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;

/**
 * Created by igor on 8/15/17.
 */
public class Cinema {

    String cinemaName;
    private ArrayList<Row> rows;
    private ArrayList<Seance> seances;

    public Cinema(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void createRows(int seatCount, int rowCount) {
        this.rows.addAll(rows);
    }
//
    public void printSeatPlan() {
        System.out.println();
        int maxSeatsInRow = 0;
        for (Row row : rows) {
            if (row.getSeats().size() > maxSeatsInRow) {
                maxSeatsInRow = row.getSeats().size();
            }
        }
    }
}
