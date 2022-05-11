package relationship.inner_class.anonymous;

import relationship.inner_class.regular.Engine;

public class Car {

    public Engine getEngine(int capacity) {
        //capacity = 10;    -> pot folosi doar daca e final sau effectevly final (nu e final, dar nu se modifica)
        return new Engine() {
           private int size = 11;

           public void printSize() {
               System.out.println("This is the size;");
               System.out.println("Capacity: " + capacity);
           }
        };
    }
}
