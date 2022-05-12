package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUsage {

    public static void main(String[] args) {

        //Instantiere ArrayList
        List<String> vegetables = new ArrayList<>();

        //Putem sa setam o lungime initiala, dar daca va fi depasita, va fi realocat automat un spatiu mai mare
        List<String> plants = new ArrayList<>(10);

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange", "Grape"));
        //String[] fruitsArray = {"Apple", "Orange", "Grape"};

        System.out.println("Initial array");
        printArray(fruits);

        System.out.println("Adding element at the end of the array");
        fruits.add("Pear");
        printArray(fruits);

        System.out.println("Adding element at a specific index:");
        fruits.add(2, "Strawberry");
        printArray(fruits);

        //fruitsArray[2]
        String fruit = fruits.get(2);
        System.out.println("Element number 2: " + fruit);

        //fruitArray[2]  = "Orange"
        System.out.println("Set element from index 2 - value Orange");
        fruits.set(2, "Orange");
        printArray(fruits);

        System.out.println("Removing element: by index");
        String result = fruits.remove(0);   //returneaza elementul care a fost sters (eg: "Apple")
        System.out.println("Result: " + result);
        printArray(fruits);

        System.out.println("Remove element: by object");
        boolean resultBoolean = fruits.remove("Orange");            //true, pentru ca l-a gasit
        System.out.println("Result: " + resultBoolean);
        printArray(fruits);

        System.out.println("Remove element: by object not found");
        resultBoolean = fruits.remove("Watermelon");                //false, pentru ca nu l-a gasit
        System.out.println("Result: " + resultBoolean);
        printArray(fruits);

        System.out.println("Remove element: by collection");
        resultBoolean = fruits.removeAll(Arrays.asList("Grape", "Pear", "Blueberry"));  //true, pentru ca a resuit sa stearga cel putin un element
        System.out.println("Result: " + resultBoolean);
        printArray(fruits);


        System.out.println("Remove element: by collection none found");
        resultBoolean = fruits.removeAll(Arrays.asList("BlueGrape", "WhitePear", "Blueberry")); //falsem oentru ca nu a reusit sa stearga nimic
        System.out.println("Result: " + resultBoolean);
        printArray(fruits);


    }

    private static <E> void printArray(List<E> array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
