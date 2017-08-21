package prog.kiev.ua.homework.Module7.PersonsFilter;

import java.util.Arrays;

/**
 * Created by igorsinchuk on 8/20/17.
 */
public class Runner {
    public static void main(String[] args) {

        PersonFilter personFilter = new PersonFilter(Arrays.asList(
                new Person("Tom", 34),
                new Person("John", 15),
                new Person("Lisa", 16),
                new Person("Latoya", 14)));
        PersonFilter teenagers = personFilter.getTeenagers();
        System.out.println(teenagers.sortPersons().toString());
    }
}
