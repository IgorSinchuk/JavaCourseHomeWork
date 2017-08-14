package prog.kiev.ua.homework.FinalTaskCinema;

/**
 * Created by igor on 8/9/17.
 */
public class Customer {

    int id;
    String firstName;
    String secondName;



    public Customer(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void printCustomer() {
        System.out.println(secondName + " " + firstName);
    }


}
