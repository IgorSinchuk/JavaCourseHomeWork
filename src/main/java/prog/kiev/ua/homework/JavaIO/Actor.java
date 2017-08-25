package prog.kiev.ua.homework.JavaIO;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class Actor {
        private String name;


        public Actor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return  name ;
        }
}
