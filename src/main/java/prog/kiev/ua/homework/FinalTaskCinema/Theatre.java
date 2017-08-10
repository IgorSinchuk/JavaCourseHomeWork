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
        System.out.println();
        int maxSeatsInRow = 0;
        for (Row row : getRows()) {
            if (row.getSeats().size() > maxSeatsInRow) {
                maxSeatsInRow = row.getSeats().size();
            }
        }

        System.out.println( "   |");
        for (int i = 1; i <= maxSeatsInRow; i++) {
            System.out.println(" " + 1);
        }

        System.out.println("\n");
        System.out.println("----");
        for (int i = 1; i <= maxSeatsInRow; i++) {
            if (i > 9) {
                System.out.println("---");
            } else {
                System.out.println("--");
            }
        }

        System.out.println("\n");
        for (Row row : getRows()) {
            if (row.getRowNumber() > 9) {
                System.out.println(row.getRowNumber() + " | ");
            } else {
                System.out.println(row.getSeats() + "  | ");
            }
            for (Seat seat : row.getSeats()) {
                if (seat.getReservationStatus()) {
                    System.out.println("X ");
                } else {
                    System.out.println(seat.getSeatNumber() + " ");
                }
            }

            System.out.println("\n");
        }
        System.out.println("\n");
    }


}
