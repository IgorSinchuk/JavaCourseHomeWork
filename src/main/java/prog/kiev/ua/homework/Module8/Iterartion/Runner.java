package prog.kiev.ua.homework.Module8.Iterartion;

/**
 * Created by igorsinchuk on 8/22/17.
 */
public class Runner {
    public static void main(String[] args) {
        Person Tod = new Person("Tod");
        Person unnamed = new Person();
        Person emptyValue = new Person();
        Person Jack = new Person("Jack");
        Person emptyValue2 = new Person();

        People people = new People();
        people.add(Tod).add(unnamed).add(emptyValue).add(Jack).add(emptyValue2);

        System.out.println("Values before deleting: " + people.toString());
        people.deleteName();
        System.out.println("Values after: " +people.toString());
    }
}
