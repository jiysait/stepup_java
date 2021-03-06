package common;

public class RecursionFactorial {

    public static void main(String[] args) {
        // 0! = 1
        // 1! = 1
        // 5! = 1x2x3x4x5
        int input = 5;
        int result = factorial(input);
        System.out.println(input + " Factorial: " + result);
    }

    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
