package prog.kiev.ua.homework.module2.Animal;

/**
 * Created by igorsinchuk on 7/26/17.
 */
public class Runner {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Tod");

        System.out.println("Puppy`s name is: ");
        puppy.showName();
        puppy.run();
        puppy.bark();
        puppy.bite();
        puppy.jump();

    }
}
