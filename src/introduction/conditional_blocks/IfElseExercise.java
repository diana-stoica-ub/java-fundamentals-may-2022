package introduction.conditional_blocks;

public class IfElseExercise {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 3;

        if (a > b) {
            System.out.println("A is greater than b");
            System.out.println("This is a second instruction");
        } else {        //poate sa lipseasca
            System.out.println("B is greater then a");
        }

        if (a > b) {
            System.out.println("A is greater");
            if (a == 10) {
                System.out.println("A equals 10");
            } else {
                System.out.println("A != 10");
            }
        } else if (a == b) {                //putem avea mai multe branch-uri de tip else if
            System.out.println("A equals b");
        }

        if (a > b) {
            System.out.println("Message 1");
        } else if (b > c) {
            System.out.println("Message 2");
        } else {
            System.out.println("Message 3");
        }

        if (a > b) //intotdeauna folositi {}, chiar daca sunt optionalte cand avem o singura instructiune in blocul if
            System.out.println("Message 1");
            System.out.println("Message 33");

    }
}
