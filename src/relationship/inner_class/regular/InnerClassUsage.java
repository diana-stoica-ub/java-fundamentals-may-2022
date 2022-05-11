package relationship.inner_class.regular;

import relationship.inner_class.static_nested_class.OuterClass;

public class InnerClassUsage {

    public static void main(String[] args) {
        //regular inner class
        Car car = new Car();

        Car.DieselEngine dieselEngine = car.buildNewEngine();
        Car.DieselEngine dieselEngine2 = car.new DieselEngine(100);

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();   //instantiere clasa statica interna
        staticInnerClass.printMessage();
    }
}
