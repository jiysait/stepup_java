package common;

public class OddCount {

    public static void main(String[] args) {
        int[] intArr = {1, 10, 100, 3, 4, 55, 6, 77, 8, 4, 43, 33, 35, 366, 6322};

        int oddCount = 0;
        for( int i = 0; i < intArr.length; i++ ) {
            if( intArr[i] % 2 != 0 ) {
                // odd number
                oddCount++;
            }
        }

        System.out.println(oddCount);

    }

}
