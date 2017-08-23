package prog.kiev.ua.homework.Module9.AgeCategoriesPerson;

import java.util.SortedMap;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class AgeCategories {
    public static SortedMap<Integer, Person> findTeenagers(SortedMap<Integer, Person> people) {
        SortedMap<Integer, Person> teenagers;
        teenagers = people.subMap(12, 18);
        return teenagers;
    }

    public static Person findOldestPerson(SortedMap<Integer, Person> persons, int someAge) {
        SortedMap<Integer, Person> personsYoungerAge;
        personsYoungerAge = persons.headMap(someAge);
        return personsYoungerAge.get(persons.lastKey());
    }

    public static Person findYoungestPerson(SortedMap<Integer, Person> persons, int someAge) {
        SortedMap<Integer, Person> personsOlderAge;
        personsOlderAge = persons.tailMap(someAge);
        return personsOlderAge.get(persons.firstKey());
    }
}
