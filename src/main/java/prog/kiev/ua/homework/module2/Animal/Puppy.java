package prog.kiev.ua.homework.module2.Animal;

/**
 * Created by igorsinchuk on 7/26/17.
 */
public class Puppy extends Dog{

    private String name;

    Puppy(String name) {
        this.name = name;
    }

    void bark() {
        System.out.println(this.getClass().getSimpleName() + " barks.");
    }

    void showName() {
        System.out.println(name);
    }
}
