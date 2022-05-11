package relationship.inheritance.interfaces;

public class Dog implements Mammal, Pet {

    private String furColour;
    private String species;

    public Dog(String furColour, String species) {
        this.furColour = furColour;
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    @Override
    public void makeNoise() {
        System.out.println("Ham ham");
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public void printFurColour() {
        System.out.println("Fur" + furColour);
    }

    @Override
    public void displayPetMessage() {
        System.out.println("I like humans");
    }

    @Override
    public void test() {        //daca suprascriem - nici o problema, va fi apelata asta
        Mammal.super.test();
        System.out.println("Test from Dog");
    }

    static void printDescription() {            //method hiding
        System.out.println("I am a dog.");
    }
}
