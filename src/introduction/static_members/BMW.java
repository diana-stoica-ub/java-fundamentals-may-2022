package introduction.static_members;

import introduction.classes.Person;

public class BMW {

    private String registrationPlate;
    private Person owner;

    public static long maxSpeed = 200;
    public static int noOfWheels = 4;


    public static Double convertFromKmPerHourToMilesPerHour(Long speed) {
        return speed / 3.6;
    }

    public void requestNewRegistrationPlate() {
        //...
    }

    public void changeOwner(Person newOwner) {
        this.owner = newOwner;
        registrationPlate = null;
        requestNewRegistrationPlate();
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
