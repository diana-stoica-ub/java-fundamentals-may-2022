package relationship.inheritance.interfaces;

public class InterfaceUsage {

    public static void main(String[] args) {
        Animal dog = new Dog("black", "dog");
        Animal penguin = new Penguin("penguin", "blakc and white");

        Dog dog2 = new Dog("gray", "dog");

        System.out.println("Dog methods");
        dog.eat();
        dog.makeNoise();
        Mammal.printDescription();
        Dog.printDescription();
        System.out.println(Mammal.produces);

        System.out.println("Penguin methods");
        penguin.eat();
        penguin.makeNoise();
        System.out.println(penguin.getSpecies());
    }
}
