package prog.kiev.ua.homework.FinalTaskCinema;

/**
 * Created by igor on 8/9/17.
 */
public class Customer {

    int id;
    String firstName;
    String secondName;
    String street;
    int streetNumber;
    int plz;
    String city;


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

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setPLZ(int plz) {
        this.plz = plz;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void printCustomer() {
        System.out.println(secondName + " " + firstName);
        System.out.println(street + " " + streetNumber);
        System.out.println(plz + " " + city);
    }


}
