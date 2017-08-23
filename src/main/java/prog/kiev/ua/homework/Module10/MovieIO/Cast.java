package prog.kiev.ua.homework.Module10.MovieIO;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class Cast {

    private String name;

    public Cast(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
