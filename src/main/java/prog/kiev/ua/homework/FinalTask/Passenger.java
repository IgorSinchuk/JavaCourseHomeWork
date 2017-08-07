package prog.kiev.ua.homework.FinalTask;

/**
 * Created by igor on 8/7/17.
 */
public class Passenger {

    private String firstName = null;
    private String secondName = null;


    public Passenger() {

    }

    public Passenger(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
