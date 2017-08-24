package prog.kiev.ua.homework.Module9.AgeCategoriesPerson;

/**
 * Created by igorsinchuk on 8/23/17.
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old";
    }
}