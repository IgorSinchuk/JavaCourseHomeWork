package prog.kiev.ua.homework.Module10.MovieIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/12/17.
 */
public class Runner {

    public static void main(String[] args) throws IOException {
        IOMovies movies = new IOMovies();

        movies.addMovie(new Movie("Crash", 2004));
        movies.writeMovies();
        System.out.println(movies.readMovie());
        movies.writetStream();
        System.out.println(movies.readStream());
    }

}