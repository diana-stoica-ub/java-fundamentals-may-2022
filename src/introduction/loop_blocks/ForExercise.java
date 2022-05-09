package introduction.loop_blocks;

public class ForExercise {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println("Hello world! " + i);
        }

        for (int i = 0; i < 30; i++) {
            System.out.println("Second Hello world! " + i);
            if (i != 0 && i % 5 == 0) {
                break;
            }
        }

        for (int i = 0; i < 30; i+=5) {
            System.out.println("Third Hello world! " + i);
        }

        for (int i = 0; i < 30; i++) {
            if (i % 5 == 0) {
                System.out.println("Fourth Hello world! " + i);
            }
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println("Fifth Hello world! " + i);
        }

    }
}
