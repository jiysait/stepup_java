package common;

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3};

        try {
            System.out.println(intArr[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException needs to be handled");
        }
    }

}
