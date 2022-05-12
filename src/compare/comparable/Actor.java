package compare.comparable;

public class Actor implements Comparable<Actor> {

    private String firstName;
    private String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Actor actor) {
        //daca obiectul curent (this) este mai mare decat cel primit ca si parametru (o) -> return numar pozitiv
        //daca obiectul curent (this) este mai mic decat cel primit ca si parametru (o) -> return numar negativ
        //daca sunt egale => 0
        if (this.firstName.compareTo(actor.firstName) < 0) {
            return 1;
        } else if (this.firstName.compareTo(actor.firstName) > 0) {
            return -1;
        } else if (this.lastName.compareTo(actor.lastName) < 0) {
            return 1;
        } else if (this.lastName.compareTo(actor.lastName) > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
