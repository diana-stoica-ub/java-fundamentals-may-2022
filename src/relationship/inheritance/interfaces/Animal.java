package relationship.inheritance.interfaces;

public interface Animal {

    public void eat();      //este publica by default, keyword-ul public poate lipsi
                            //metoda abstracta - nu are implementare

    void makeNoise();

    String getSpecies();

    default void test() {
        System.out.println("Test from Animal");
    }
}
