package prog.kiev.ua.homework.JavaIO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class Films implements Iterable<Film>,Serializable {
    protected List<Film> films;

    public Films() {
        films = new ArrayList<Film>();
    }

    public  void addFilm(Film film){
        films.add(film);
    }


    public void addFilm(Films films){
        this.films.addAll(films.getFilms());
    }

    public List<Film> getFilms() {
        return films;
    }

    public Iterator<Film> iterator() {
        return new Iterator<Film> () {
            private final Iterator<Film> iter = films.iterator();

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public Film next() {
                return iter.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("no changes allowed");
            }
        };
    }

    @Override
    public String toString() {
        if(films.isEmpty())return "This list is empty";
        return "List of filsms:\n" + films ;
    }
}

