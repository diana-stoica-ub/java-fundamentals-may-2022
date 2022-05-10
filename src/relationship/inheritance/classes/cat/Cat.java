package relationship.inheritance.classes.cat;

import relationship.inheritance.classes.Animal;

public class Cat extends Animal {

    //atribute ce sunt caracteristice doar clasei copil
    private FurType furtype;

    //constructori
    public Cat(String name, String colour, FurType furtype) {
        super(name, colour);        //apeleaza constructorul din clasa parinte
        this.furtype = furtype;
    }

    public Cat(String name, String colour) {
        super(name, colour);
    }

    //metode suprascrise din clasa parinte
    @Override
    public void makeNoise() {
        System.out.println("Meow meow");
    }

    //
    public void purr() {
        System.out.println("Purr purr");
    }

    public void testProtectedKeyword() {
        super.protectedField = "I can set a protected field from the child class";
        super.protectedMethod();
    }

    //getters & setters
    public FurType getFurtype() {
        return furtype;
    }

    public void setFurtype(FurType furtype) {
        this.furtype = furtype;
    }
}
