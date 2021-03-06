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
    private List<String> seanceList = new ArrayList<>();
    private int releaseDate;

    public Movie(String name, long releasedDate) {
        this.name = name;
        this.releasedDate = releasedDate;
    }

    public String getName() {
        return name;
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

    public List<String> getSeanceList() {
        return seanceList;
    }

    public Movie addGenre(Genre genre) {
        genres.add(genre);
        return this;
    }

    public Movie addCast(String cast) {
        castList.add(cast);
        return this;
    }

    public Movie addSeance(String seance) {
        seanceList.add(seance);
        return this;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "\nname = \'" + name + '\'' +
                ", \nreleasedDate = " + releasedDate +
                ", \ngenres =" + genres +
                ", \ncastList =" + castList +
                '}';
    }

    public int getReleaseDate() {
        return releaseDate;
    }
}
