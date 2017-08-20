package prog.kiev.ua.homework.Module7.PersonsFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by igorsinchuk on 8/20/17.
 */
public class PersonFilter {

    private List<Person> personsList;

    public PersonFilter(List<Person> personList) {
        this.personsList = personsList;
    }

    public PersonFilter add(Person person) {
        this.personsList.add(person);
        return this;
    }

    public PersonFilter getTeenagers() {
        List<Person> teenagers = new ArrayList<>();
        for (Person person : this.personsList) {
            if (person.getAge() >=12 && person.getAge() <= 17) {
                teenagers.add(person);
            }
        }
        return new PersonFilter(teenagers);
    }

    public PersonFilter sortPerson() {
        Collections.sort(per);
    }

    @Override
    public String toString() {
        return "PersonFilter{" +
                "personsList=" + personsList +
                '}';
    }
}
