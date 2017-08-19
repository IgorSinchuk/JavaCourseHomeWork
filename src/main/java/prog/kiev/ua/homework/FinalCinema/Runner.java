package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/15/17.
 */
public class Runner {

    public static void main(String[] args) {

        ArrayList<Row> rows = new ArrayList<>();
        ArrayList<Seance> seances = new ArrayList<>();
        ArrayList<Seat> seats = new ArrayList<>();

        List<Movie> movieList = new ArrayList<>();
        System.out.println(movieList);
        System.out.println();
        System.out.println();
    }

    public static List<Movie> movieDetails() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Scream", 1996)
        );
        return movies;
    }


}