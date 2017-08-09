package prog.kiev.ua.homework.FinalTaskCinema;

import java.util.ArrayList;

/**
 * Created by igor on 8/9/17.
 */
public class Theatre {

    private int theatreNumber;
    private String description;
    private int rowCount;
    private ArrayList<Row> rows;

    public Theatre(int theatreNumber, String description) {
        this.theatreNumber = theatreNumber;
        this.description = description;
        rows = new ArrayList<Row>();
    }

    public void createRows(int rowClass, int seatCount, int rowCount)
    {
        for (int i = 1; i <= rowCount; i++)
        {
            rows.add(new Row(rowClass, seatCount, i));
        }
        this.rowCount += rowCount;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public String getDescription() {
        return description;
    }

    public void printSeatPlan() {

    }

}
