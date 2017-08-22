package prog.kiev.ua.homework.Module8.Iterartion;

/**
 * Created by igorsinchuk on 8/22/17.
 */
public class  Person {

    private final String name;

    public Person() {
        this.name = null;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
