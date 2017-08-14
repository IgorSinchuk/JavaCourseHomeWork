package prog.kiev.ua.homework.FinalTaskCinemaV2;


import java.util.ArrayList;

/**
 * Created by igor on 8/14/17.
 */
public class Cinema {

    private int rowCount;
    private ArrayList<Row> rows;
    private Cinema cinema;

    public Cinema(int rowCount, ArrayList<Row> rows) {
        this.rowCount = rowCount;
        this.rows = rows;
    }

    public void createRows(int rowCount, ArrayList<Row> rows) {
        for (int i = 1; i <= rowCount; i++) {
            rows.add(new Row(rowCount, i, 0));
        }
        this.rowCount += rowCount;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void printSeatPlan() {
        System.out.println();
        int maxSeatsInRow = 0;
        for (Row row : getRows()) {
            if (row.getSeats().size() > maxSeatsInRow) {
                maxSeatsInRow = row.getSeats().size();
            }
        }
    }

    public Cinema getCinema() {
        return cinema;
    }
}
