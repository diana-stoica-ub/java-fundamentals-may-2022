package exception;

public class ExceptionUsage {

    public static void main(String[] args) {

        try {
            //methodThatThrowsAnException(0);
            methodThatThrowsAnException(1);
            System.out.println("App will never get here, because above line throws an exception => catch");
        } catch (RuntimeException e) {
            System.out.println("0 is not a valid input, please insert a number >=2");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("1 is not a valid input, please insert a number >=2");
            e.printStackTrace();
        } finally {
            //inchidere fiesiere, conexiuni la baza de date, etc
            System.out.println("Finally....");
        }

        System.out.println("App is still running");

        System.out.println(finallyTest(1));

        try {
            testCustomExceptions(1);
        } catch (MyCheckedException | MyException e) {
            System.out.println("Exceptuon in method customException");
        }

    }

    private static void testCustomExceptions(int i) throws MyCheckedException {
        if (i == 0) {
            throw new MyException();
        } else if (i == 2) {
            throw new MyCheckedException();
        }
    }
    private static int finallyTest(int i) {
        try {
            if (i == 0) {
                throw new MyException();
            } else if (i == 2) {
                throw new MyCheckedException();
            }
        } catch (RuntimeException e) {
            return 1;
        } finally {
            return 2;       //bad practice sa avem instructiuni de tip return in finally
        }
    }
    public static void methodThatThrowsAnException(int i) throws Exception {
        if (i == 0) {
            throw new RuntimeException("i == 0 exception");
        }
        if (i == 1) {
            throw new Exception("i == 1 exception");
        }
    }

}
