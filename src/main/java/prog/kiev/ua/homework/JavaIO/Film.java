package prog.kiev.ua.homework.JavaIO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class Film implements Serializable {
    private String name;
    private int year;
    private List<Actor> actor = new ArrayList<Actor>();
    private List<Genre> genres = new ArrayList<Genre>();

    public Film(String name, int year, Actor[] actor, Genre[] genres) {
        this.name = name;
        this.year = year;
        this.actor = Arrays.asList(actor);
        this.genres = Arrays.asList(genres);
    }

    public Film(String name, int year ){
        this.name = name;
        this.year = year;
    }
    public void addGenre(Genre genre){
        this.genres.add(genre);
    }
    public void addActor(Actor actor){
        this.actor.add(actor);
    }

    public int getYear() {
        return year;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "Film name=\'" + name + '\'' +
                "\nyear:" + year +
                "\nactors:" + actor+
                "\ngenres:" + genres + "\n";
    }

    public String getName() {
        return name;
    }
}

