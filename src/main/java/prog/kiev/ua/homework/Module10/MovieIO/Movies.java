package prog.kiev.ua.homework.Module10.MovieIO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class Movies implements Iterable<Movie>, Serializable {
    public List<Movie> movies;

    public Movies() {
        movies = new ArrayList<Movie>();

    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addMovie(Movies movies) {
        this.movies.addAll(movies.getMovies());
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Iterator<Movie> iterator() {
        return new Iterator<Movie>() {
            private final Iterator<Movie> iterator = movies.iterator();

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Movie next() {
                return iterator.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(" Changes not allowed ");
            }
        };
    }
        @Override
        public String toString() {
            return "List of movies:\n" + movies;

    }
}
