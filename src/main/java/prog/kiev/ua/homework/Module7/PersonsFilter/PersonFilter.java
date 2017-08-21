package prog.kiev.ua.homework.Module7.PersonsFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by igorsinchuk on 8/20/17.
 */
public class PersonFilter {

    private List<Person> persons;

    public PersonFilter(List<Person> persons) {
        this.persons = persons;
    }

    public PersonFilter add(Person person){
        this.persons.add(person);
        return this;
    }

    public PersonFilter getTeenagers() {
        List<Person> teenagers = new ArrayList<>();
        for (Person person : this.persons) {
            if (person.getAge() >= 12 && person.getAge() <= 17) {
                teenagers.add(person);
            }
        }
        return new PersonFilter(teenagers);
    }

    public PersonFilter sortPersons() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getAge() == person2.getAge()) {
                    return person1.getName().compareTo(person2.getName());
                }
                return person1.getAge() - person2.getAge();
            }
        });
        return this;
    }

    @Override
    public String toString() {
        String result = "";
        for(Person person : persons){
            result += "\n" + person.toString();
        }
        return result;
    }
}
