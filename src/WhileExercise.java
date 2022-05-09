public class WhileExercise {

    public static void main(String[] args) {
        int n = 10;

        while (n > 0) {
            System.out.println("While Number " + n);
            n -= 1;
        }

        n = 10;
        do {
            System.out.println("Do-While Number " + n);
            n -= 1;
            //Echivalent cu:  --n;
            //Echivalent cu:  n--;
            //Echivalent cu:  n = n - 1;
        } while (n > 0);
    }
}
