package prog.kiev.ua.homework.Module8.Iterartion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by igorsinchuk on 8/22/17.
 */
public class People {

    private final List<Person> people = new ArrayList<>();

    public People add(Person person) {
        people.add(person);
        return this;
    }

    public void deleteName() {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName() == null || person.getName().isEmpty()) {
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("; ");
        for (Person person : people) {
            joiner.add(person.toString());
        }
        return joiner.toString();
    }
}
