public class OperatorsExercise {

    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        //operatori matematici
        int result = x + y;
        System.out.println("Addition result: " + result);

        result = x - y;
        System.out.println("Substraction result " + result);

        result = x * y;
        System.out.println("Multiply result:" + result);

        result = x / y;
        System.out.println("Division result: " + result);

        result = x % y;
        System.out.println("Modulo result: " + result);

        double f1 = 33.77;
        double f2 = 11.1;
        double resultFloat = f1 / f2;
        System.out.println("Double division result: " + resultFloat);

        resultFloat = (double)(x / y);  //cast
        System.out.println("Double division for ints result: " + resultFloat);

        resultFloat = (double) x / (double) y;
        System.out.println("Double division for ints result casted: " + resultFloat);

        //increment
        int a = 11;
        a++;
        System.out.println("Increment: " + a);
        a = 11;
        ++a;
        System.out.println("Increment: " + a);

        a = 11;
        System.out.println("a++ " + (a++));

        a = 11;
        System.out.println("++a" + (++a));

        //decrement
        a = 11;
        System.out.println("a-- " + a--);

        a = 11;
        System.out.println("--a " + --a);


        //operatori relationali

        boolean resultBool = x < y;
        System.out.println("x < y :" + resultBool);

        resultBool = x > y;
        resultBool = x >= y;
        resultBool = x <= y;

        resultBool = x == y;
        System.out.println("x == y :" + resultBool);
        resultBool = x != y;
        System.out.println("x != y :" + resultBool);

        x  = 3;
        resultBool = x == y;
        System.out.println("x == y :" + resultBool);
        resultBool = x != y;
        System.out.println("x != y :" + resultBool);


        //operatori logici

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        resultBool = b1 && b2;
        System.out.println("b1 && b2: " + resultBool);
        resultBool = b1 && b3;
        System.out.println("b1 && b3:" + resultBool);

        resultBool = b1 || b2;
        System.out.println("b1 || b2: " + resultBool);
        resultBool = b1 && (b2 || b3);

        resultBool = !b1;
        System.out.println("!b1 " + resultBool);
        resultBool = !b2;
        System.out.println("!b2 " + resultBool);


        int c1 = 3;
        int c2 = 5;
        c2 = c1 + c2;
        c2 += c1;

        int max = (c1 > c2) ? c1 : c2;
        System.out.println("Maximum is: " + max);

    }
}
