package prog.kiev.ua.homework.Module9.UniqueSortedPeson;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class Runner {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Tom", 15),
                new Person("Monica", 34),
                new Person("Justin", 28),
                new Person("Eric", 14),
                new Person("Rosa", 16),
                new Person("Christin", 20)
        );

        Set<Person> uniquePeople = new TreeSet<>(new PersonComparator());
        uniquePeople.addAll(people);
        System.out.println("Unique persons: " + uniquePeople);
    }
}
