package common;

/**
 * Catching 'Exception' first will be causing for other Exceptions
 */

public class TryCatchTest {
    public static void main(String[] args) {
        try {
            System.out.print("Hello World");
        } catch(Exception e) {
            System.out.println("e");
//        } catch(ArithmeticException e) {
//            System.out.println("e");
        } finally {
            System.out.println("!");
        }
    }
}
