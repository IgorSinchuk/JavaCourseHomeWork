package prog.kiev.ua.homework.JavaIO;

import java.io.IOException;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        IOFilms films = new IOFilms();

        films.addFilm(new Film("Ariving",2001));
        films.writeFilms();
        System.out.println(films.readFilms());
        films.writeStream();
        System.out.println(films.readStream());

    }
}
