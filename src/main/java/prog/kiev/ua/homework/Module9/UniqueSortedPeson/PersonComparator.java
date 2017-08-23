package prog.kiev.ua.homework.Module9.UniqueSortedPeson;

import java.util.Comparator;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
