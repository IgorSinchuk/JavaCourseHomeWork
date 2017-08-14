package prog.kiev.ua.homework.FinalTaskCinemaV2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/14/17.
 */
public class Movie {
    private String name;
    private long releaseDate;
    private List<String> castList = new ArrayList<>();
    private List<Genre> genres = new ArrayList<>();

    public Movie(String name, long releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public List<String> getCast() {
        return castList;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Movie addGenres(Genre genre) {
        genres.add(genre);
        return this;
    }

    public Movie addCast(String cast) {
        castList.add(cast);
        return this;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", castList=" + castList +
                ", genres=" + genres +
                '}';
    }
}
