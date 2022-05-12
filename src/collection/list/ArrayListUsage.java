package collection.list;

import collection.Employee;
import collection.NameComparator;

import java.util.*;

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

        fruits.addAll(Arrays.asList("Cherry", "Pear", "Orange", "Apple", "Blackberry", "Watermellon"));
        printArray(fruits);

        System.out.println("Array size: " + fruits.size()); //numarul de elemente din ArrayList

        System.out.println("Iterate using for-each loop:");
        for (String element : fruits) {
            System.out.print(element + " ");
        }

        System.out.println("\nIterate using for loop");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }

        System.out.println("\nIterate using iterator:");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();       //nu trebuie sa uitam sa apelam next
            if (element.equals("Orange")) {
                iterator.remove();      //remove trebuie apelat dupa next, nu inainte
            }
        }
        printArray(fruits);

        System.out.println("Iterate backwards using iterator: ");
        ListIterator<String> listIterator = fruits.listIterator(fruits.size());

        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + "-nextIndex:" + listIterator.nextIndex() + " ");
            if (element.equals("Apple")) {
                listIterator.remove();
            }
        }
        System.out.println();
        printArray(fruits);

        if (fruits.contains("Cherry")) {
            System.out.println("Cherry is here.");
        }
        if (fruits.containsAll(Arrays.asList("Pear", "Cherry"))) {
            System.out.println("Cherry and Pear is present");
        }

        List<Integer> ints = new ArrayList<>();
        if (ints.isEmpty()) {
            System.out.println("Array is empty");
        }

        Object[] fruitsArray = fruits.toArray();
        for (Object object : fruitsArray) {
            String fruitObject = (String) object;
        }

        int index = Collections.indexOfSubList(fruits, Arrays.asList("Pear", "Blackberry"));
        System.out.println("Index of sublist: " + index);

        System.out.print("Sub-list:");
        List<String> subList = fruits.subList(1, 3);
        printArray(subList);


        System.out.println("Clear array - then add Apple");
        fruits.clear();
        fruits.add("Apple");
        printArray(fruits);

        List<String> emptyList = Collections.EMPTY_LIST;


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nume1", "Prenume1", 100));
        employees.add(new Employee("Nume3", "Prenume3", 90));
        employees.add(new Employee("Nume2", "Prenume2", 100));

        System.out.print("\n\nEmployee array:");
        printArray(employees);
        System.out.println("Max salary from collection: " + Collections.max(employees).getSalary());
        System.out.println("Min salary from collection: " + Collections.min(employees).getSalary());

        NameComparator nameComparator = new NameComparator();
        System.out.println("Max from collection using comparator: " + Collections.max(employees, nameComparator));
        System.out.println("Min from collection using comparator: " + Collections.min(employees, nameComparator));

        System.out.println("Sort array:");
        Collections.sort(employees);
        printArray(employees);

        System.out.println("Sort array using comparator");
        Collections.sort(employees, nameComparator);
        printArray(employees);

        employees.sort(nameComparator);

        System.out.println("Fill..");
        Collections.fill(employees, new Employee("New", "New", 2));
        printArray(employees);

    }

    private static <E> void printArray(List<E> array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
