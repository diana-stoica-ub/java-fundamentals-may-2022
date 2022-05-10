package introduction.array;

public class ArrayUsage {

    public static void main(String[] args) {
        int[] ints = new int[3];        //allocates place in memory for 3 ints

        ints[0] = 10;
        ints[1] = 11;
        ints[2] = 12;

        //ints[3] = 10;  -> ArrayIndexOutOfBoundsException

        //for loop
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

        //for-each loop
        for (int value : ints) {
            System.out.print(value + " ");
        }

        System.out.println("Length of array: " + ints.length);

        int[] emptyArray = new int[5];
        System.out.println("Empty array size: " + emptyArray.length);
        for (int value : emptyArray) {
            System.out.print(value + " ");
        }
    }
}
