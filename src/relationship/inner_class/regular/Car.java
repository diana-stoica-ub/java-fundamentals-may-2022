package relationship.inner_class.regular;

public class Car {

    private String colour;

    public class DieselEngine implements Engine {
        private int capacity;

        public DieselEngine(int capacity) {
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }

    public DieselEngine buildNewEngine() {
        DieselEngine dieselEngine = new DieselEngine(100);
        System.out.println("I am using this engine: " + dieselEngine.getCapacity());

        return dieselEngine;
    }


}
