package relationship.inner_class.block;

import relationship.inner_class.regular.Engine;

public class Car {

    public Engine buildEngine() {
        System.out.println("I am building a new engine");
        int a = 10;

        class ImprovedDiesel implements Engine {
            private int capacity;

            public ImprovedDiesel(int capacity) {
                this.capacity = capacity;
            }

            public int getCapacity() {
                return capacity;
            }

            public void setCapacity(int capacity) {
                this.capacity = capacity;
            }
        }

        return new ImprovedDiesel(100);
    }
}
