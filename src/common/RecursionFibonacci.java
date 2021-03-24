package common;

public class RecursionFibonacci {

    public static void main(String[] args) {
        int[] arr = {0, 1};
        int[] result = fibonacci(arr);

        for( int i = 0; i < result.length; i++ ) {
            System.out.println(result[i]);
        }
    }

    public static int[] fibonacci(int[] arr) {
        if(arr.length < 10) {
            int prev = arr.length - 1 - 1;
            int last = arr.length - 1;
            int[] newArr = new int[arr.length + 1];
            int i = 0;
            while(i < arr.length) {
                newArr[i] = arr[i];
                i++;
            }
            newArr[i] = arr[prev] + arr[last];
            return fibonacci(newArr);
        } else {
            return arr;
        }
    }

}
