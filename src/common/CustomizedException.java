package common;

public class CustomizedException {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
            System.out.println("B");
        } catch (Exception ex) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
    }

    public static void badMethod() {
        throw new Error();
    }
}
