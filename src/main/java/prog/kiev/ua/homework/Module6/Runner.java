package prog.kiev.ua.homework.Module6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by igor on 8/11/17.
 */
public class Runner {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList(Arrays.asList(Genre.HORROR, Genre.THRILLER,
                Genre.ACTION));

        System.out.println();
        System.out.println();
    }

    private static List<Movie> MovieF() {
        Movie movie1 = new Movie("Scream", 1996);
        movie1.addGenre(Genre.HORROR);


        Movie movie2 = new Movie("Old school", 2003);
        movie2.addGenre(Genre.COMEDY);



        return null;
    }
}
