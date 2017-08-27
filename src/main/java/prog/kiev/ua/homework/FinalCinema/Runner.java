package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by igor on 8/15/17.
 */
public class Runner {

    public static void main(String[] args) {

        List<Movie> moviesList = fillMovie();
        List<Seance> seanceList = fillSeance();
        System.out.println(moviesList);
        System.out.println(seanceList);
        System.out.println(Runner.releasedMovie(moviesList));
        System.out.println(Runner.movieGenre(moviesList));

    }

    public static List<Movie> fillMovie() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Crash", 2004)
                .addGenre(Genre.DRAMA)
                .addCast("Sandra Bullock")
                .addCast("Don Cheadle")
                .addCast("Matt Dillon")
                .addSeance("09.2017"));

        return movies;
    }

    public static List<Seance> fillSeance() {
        List<Seance> seances = new ArrayList<>();
        seances.add(new Seance(9, 8, 26, 34));

        return seances;
    }
    public static List<Movie> movieGenre(List<Movie> movieList) {
        List<Movie> movieGenred = new ArrayList<>();
        for (Movie movie : movieList) {
            for (Genre genre : movie.getGenres()) {
                if (genre.equals(Genre.HORROR) || genre.equals(Genre.THRILLER)) {
                    movieGenred.add(movie);
                }
            }
        }

        return movieGenred;
    }

    public static List<Movie> releasedMovie(List<Movie> movieList) {
        List<Movie> releasedMovies = new ArrayList<>();
        for (Movie movie : movieList) {
            if (movie.getReleaseDate() >= 1990 && movie.getReleaseDate() <= 2000) {
                for (Genre genre : movie.getGenres()) {
                    if (genre.equals(Genre.COMEDY)) {
                        releasedMovies.add(movie);
                    }
                }
            }
        }

        return releasedMovies;
    }

//    public static List<Row> rowList(List<Seance> seanceList) {
//        List<Row> rowList = new ArrayList<>();
//        for (Seance seance : seanceList) {
//            for (Seat seat : seance.getRows) {
//            if (seance.getRowNumber() >= 9 && seance.getRowNumber() <= 1) {
//                rowList.add(seat);
//            }
//        }
//    }


    }
