package relationship.inheritance.abstract_classes;

public class AbstractClassUsage {

    public static void main(String[] args) {
        //Animal animal = new Animal(); ->nu pot instantia o clasa abstracta

        Horse horse = new Horse(10, "Black");
        horse.makeNoise();
        System.out.println("Number of legs " + horse.getNoOfLegs());
        System.out.println(Animal.CONSTANT);
    }
}
