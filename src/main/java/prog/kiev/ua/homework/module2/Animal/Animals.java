package prog.kiev.ua.homework.module2.Animal;

/**
 * Created by igorsinchuk on 7/26/17.
 */
abstract class Animals {

    void run() {
        System.out.println(this.getClass().getSimpleName() + " runs.");
    }

    void jump() {
        System.out.println(this.getClass().getSimpleName() + " jumps.");
    }
}
