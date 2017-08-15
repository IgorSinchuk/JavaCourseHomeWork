package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;

/**
 * Created by igor on 8/15/17.
 */
public class Cinema {

    private ArrayList<Row> rows;

    public void createRows(ArrayList<Row> rows) {
        this.rows.addAll(rows);

    }

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
