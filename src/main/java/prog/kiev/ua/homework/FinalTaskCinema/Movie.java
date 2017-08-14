package prog.kiev.ua.homework.FinalTaskCinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 8/14/17.
 */
public class Movie {
    private String name;
    private int releaseDate;
    private List<Genre> genres = new ArrayList<>();
    private List<Cast> castList = new ArrayList<>();

    public Movie(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void addCAst(Cast cast) {
        castList.add(cast);
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Movie addGenre(Genre genre) {
        genres.add(genre);
        return this;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", genres=" + genres +
                ", castList=" + castList +
                '}';
    }
}
