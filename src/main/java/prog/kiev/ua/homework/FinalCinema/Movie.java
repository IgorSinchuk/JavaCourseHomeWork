package prog.kiev.ua.homework.FinalCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/15/17.
 */
public class Movie {
    private String name;
    private long releasedDate;
    private List<Genre> genres = new ArrayList<>();
    private List<String> castList = new ArrayList<>();

    public Movie(String name, long releasedDate) {
        this.name = name;
        this.releasedDate = releasedDate;
    }

    public long getReleasedDate() {
        return releasedDate;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public List<String> getCastList() {
        return castList;
    }

    public Movie addCast(Genre genre, String cast) {
        genres.add(genre);
        castList.add(cast);
        return this;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releasedDate=" + releasedDate +
                ", genres=" + genres +
                ", castList=" + castList +
                '}';
    }
}
