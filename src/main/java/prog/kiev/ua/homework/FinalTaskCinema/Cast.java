package prog.kiev.ua.homework.FinalTaskCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/14/17.
 */
public class Cast {

    private String name;
    private List<Movie> movies = new ArrayList<>();

    public Cast(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}
