package relationship.inheritance.classes;

import relationship.inheritance.classes.cat.Cat;
import relationship.inheritance.classes.cat.FurType;

public class InheritanceUsage {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal Generic", "black");

        System.out.println("Call methods from animal:");
        animal.makeNoise();
        animal.eat();
        animal.eat("Fish");

        Cat cat = new Cat("Siamese", "gray", FurType.MEDIUM);

        System.out.println("Call methods from cat:");
        cat.makeNoise();
        cat.eat();

        //polimorfism
        Animal animal2 = new Cat("CatType", "orange", FurType.LONG);

        printAnimals(animal);
        printAnimals(animal2);
        printAnimals(cat);

        //printCat(animal);     -> does not work
    }

    private static void printAnimals(Animal animal) {
        System.out.println("Animal printer: " + animal.getName() + " " + animal.getColour());
    }

    private static void printCat(Cat cat) {
        System.out.println("Cat printer: " + cat.getName() + " " + cat.getFurtype());
    }
}
