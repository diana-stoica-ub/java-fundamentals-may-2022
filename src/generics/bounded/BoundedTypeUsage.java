package generics.bounded;

import introduction.classes.Person;

public class BoundedTypeUsage {

    public static <T extends Comparable> T max(T x, T y) {
        if (y.compareTo(x) > 0) {
            return y;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max("Aaa", "Aab"));
       // System.out.println(max(new Person("Nume", "Prenune"), new Person("nume", "prenume"))); -> nu functioneaza nu implementeaza Comparable

    }
}
