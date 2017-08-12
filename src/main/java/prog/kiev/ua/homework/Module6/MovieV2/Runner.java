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

        movies.add(new Movie("Old school", 2003)
                .addGenres(Genre.COMEDY)
                .addCast("Luke Wilson")
                .addCast("Will Ferrell")
                .addCast("Vince Vaughn"));

        movies.add(new Movie("King kong", 2005)
                .addGenres(Genre.FANTASY)
                .addGenres(Genre.ACTION)
                .addCast("Naomi Watts")
                .addCast("Jack Black")
                .addCast("Adrien Brody"));

        movies.add(new Movie("Grindhouse", 2007)
                .addGenres(Genre.HORROR)
                .addGenres(Genre.THRILLER)
                .addGenres(Genre.ACTION)
                .addCast("Rose McGowan")
                .addCast("Kurt Russell")
                .addCast("Bruce Willis"));

        movies.add(new Movie("The Guard", 2011)
                .addGenres(Genre.COMEDY)
                .addGenres(Genre.ACTION)
                .addCast("Brendan Gleeson")
                .addCast("Don Cheadle")
                .addCast("Mark Strong"));

        movies.add(new Movie("Django Unchained", 2012)
                .addGenres(Genre.WESTERN)
                .addCast("Jamie Foxx")
                .addCast("Christoph Waltz")
                .addCast("Leonardo DiCaprio"));

        movies.add(new Movie("The Sixth Sense", 1999)
                .addGenres(Genre.THRILLER)
                .addCast("Bruce Willis")
                .addCast("Toni Collette")
                .addCast("Haley Joel Osment"));

        movies.add(new Movie("Saving Private Ryan", 1998)
                .addGenres(Genre.DRAMA)
                .addCast("Tom Hanks")
                .addCast("Edward Burns")
                .addCast("Matt Damon"));

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