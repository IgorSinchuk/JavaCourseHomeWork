package prog.kiev.ua.homework.Module6.MovieV2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/12/17.
 */
public class Runner {

    public static void main(String[] args) {


        List<Movie> movieList = fillMovie();
        System.out.println(movieList);
        System.out.println(Runner.movieGenre(movieList));
        System.out.println(Runner.releasedMovie(movieList));

    }

    public static List<Movie> fillMovie() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Scream" , 1996)
                .addGenres(Genre.HORROR)
                .addGenres(Genre.THRILLER)
                .addCast("Neve Campbell")
                .addCast("Courteney Cox")
                .addCast("David Arquette"));


        return movies;

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

}