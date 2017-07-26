package prog.kiev.ua.homework.module2.Animal;

/**
 * Created by igorsinchuk on 7/26/17.
 */
public class Dog extends Animals{
    void bite() {
        System.out.println(this.getClass().getSimpleName() + " bites.");
    }
}
