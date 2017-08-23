package prog.kiev.ua.homework.Module9.AgeCategoriesPerson;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import static prog.kiev.ua.homework.Module9.AgeCategoriesPerson.AgeCategories.findTeenagers;
import static prog.kiev.ua.homework.Module9.AgeCategoriesPerson.AgeCategories.findOldestPerson;
import static prog.kiev.ua.homework.Module9.AgeCategoriesPerson.AgeCategories.findYoungestPerson;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class Runner {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Tom", 15),
                new Person("Monica", 34),
                new Person("Justin", 18),
                new Person("Eric", 14),
                new Person("Rosa", 16),
                new Person("Christin", 20)
        );
        SortedMap<Integer, Person> ageCategories = new TreeMap<>();
        for (Person person : people) {
            ageCategories.put(person.getAge(), person);
        }
        System.out.println("Age categories : " + ageCategories);

        SortedMap<Integer, Person> teenagers = findTeenagers(ageCategories);
        System.out.println("Teenagers : " + teenagers);

        Person older18 = findOldestPerson(ageCategories, 18);
        System.out.println("More than 18 : " + older18);

        Person younger18 = findYoungestPerson(ageCategories, 18);
        System.out.println("Less than 18 : " + younger18);


    }
}