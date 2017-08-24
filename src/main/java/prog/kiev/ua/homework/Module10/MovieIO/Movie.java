package prog.kiev.ua.homework.Module10.MovieIO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by igor on 8/12/17.
 */
public class Movie implements Serializable{

    private String name;
    private int releaseDate;
    private List<Cast> castList = new ArrayList<>();
    private List<Genre> genres = new ArrayList<>();


    public Movie(String name, int releaseDate, Cast[] cast, Genre[] genres) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.castList = Arrays.asList(cast);
        this.genres = Arrays.asList(genres);
    }

    public Movie(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public List<Cast> getCast() {
        return castList;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void addGenres(Genre genre) {
        this.genres.add(genre);
    }

    public void addCast(Cast cast) {
        this.castList.add(cast);
    }


    @Override
    public String toString() {
        return "Film name=\'" + name + '\'' +
                "\nyear:" + releaseDate +
                "\nactors:" + castList +
                "\ngenres:" + genres + "\n";
    }


}
