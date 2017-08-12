package prog.kiev.ua.homework.Module6.MovieHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by igor on 8/11/17.
 */
public class Runner {

    public static void main(String[] args) {
        List<Movie> movies = MovieF();
        List<Genre> genres = new ArrayList<>(Arrays.asList(Genre.HORROR, Genre.COMEDY));

        System.out.println(releaseFilter(movies, 1990, 2020));

    }

    private static List<Movie> MovieF() {
        Movie movie1 = new Movie(  "Scream" , 1996 );
        movie1.addGenre(Genre.HORROR);


        Movie movie2 = new Movie("Old school", 2003);
        movie2.addGenre(Genre.COMEDY);

        Movie movie3 = new Movie("King kong", 2005);
        movie3.addGenre(Genre.FANTASY)
                .addGenre(Genre.ACTION);

        Movie movie4 = new Movie("Grindhouse", 2007);
        movie4.addGenre(Genre.ACTION)
                .addGenre(Genre.HORROR);
//                .addCast(Cast.);

        Movie movie5 = new Movie("The Guard", 2011);
        movie5.addGenre(Genre.ACTION)
                .addGenre(Genre.COMEDY);

        Movie movie6 = new Movie("Django Unchained", 2012 );
        movie6.addGenre(Genre.WESTERN);


        Movie movie7 = new Movie("The Sixth Sense", 1999);
        movie7.addGenre(Genre.THRILLER);

        Movie movie8 = new Movie("Saving Private Ryan", 1998);
        movie8.addGenre(Genre.DRAMA);

        List<Movie> movies = new ArrayList<>(Arrays.asList(movie1, movie2, movie3,
                movie4, movie5, movie6, movie7, movie8));

        return movies;
    }


    private static List<Movie> releaseFilter(List<Movie>  movies, int releaseYearFrom, int releaseYearTo) {
        return movies.stream()
                .filter(b -> b.getReleaseDate() >= releaseYearFrom && b.getReleaseDate() <= releaseYearTo)
                .collect(Collectors.toList());
    }


}
