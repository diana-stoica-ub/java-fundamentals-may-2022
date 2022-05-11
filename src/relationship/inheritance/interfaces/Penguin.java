package relationship.inheritance.interfaces;

public class Penguin implements Bird {

    private String species;
    private String feathersColour;


    public Penguin(String species, String feathersColour) {
        this.species = species;
        this.feathersColour = feathersColour;
    }



    public void setSpecies(String species) {
        this.species = species;
    }

    public void setFeathersColour(String feathersColour) {
        this.feathersColour = feathersColour;
    }

    @Override
    public void eat() {
        System.out.println("I eat fish");
    }

    @Override
    public void makeNoise() {
        System.out.println("I don't make noise");
    }

    @Override
    public String getSpecies() {
        return this.species;
    }

    @Override
    public String getFeathersColour() {
        return this.feathersColour;
    }

    @Override
    public void fly() {
        //Bird.super.fly();
        System.out.println("I can't fly");
    }
}
