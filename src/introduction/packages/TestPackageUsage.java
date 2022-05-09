package introduction.packages;

//import introduction.packages.hello.HelloNewWorldPrinter;
//import introduction.packages.hello.HelloWorldPrinter;
import introduction.packages.hello.*;

public class TestPackageUsage {

    public static void main(String[] args) {
        System.out.println("This is from main!");

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.printHelloWorld();

        HelloNewWorldPrinter helloNewWorldPrinter = new HelloNewWorldPrinter();
        helloNewWorldPrinter.printHelloNewWorld();
    }
}
