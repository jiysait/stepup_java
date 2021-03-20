package algorithm;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArr = {5, 1, 4, 2, 8};

        for( int i = 0; i < unsortedArr.length - 1; i++) {
            for (int j = 0; j < unsortedArr.length - i - 1; j++) {
                if (unsortedArr[j] > unsortedArr[j + 1]) {
                    int tmp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j + 1];
                    unsortedArr[j + 1] = tmp;
                }
            } // {1, 4, 2, 5, 8}
        }
        /*
        *   i = 0, j = 0
        *       5, 1, 4, 2, 8   ->  1, 5, 4, 2, 8
        *       ^
        *
        *   i = 0, j = 1
        *       1, 5, 4, 2, 8   ->  1, 4, 5, 2, 8
        *          ^
        *
        *   i = 0, j = 2
        *       1, 4, 5, 2, 8   ->  1, 4, 2, 5, 8
        *             ^
        *
        *   i = 0, j = 3 (this is last loop for j; j < arr.length - i - 1)
        *       1, 4, 2, 5, 8   ->  1, 4, 2, 5, 8
        *                ^
        *
        *   i = 1, j = 0
        *       1, 4, 2, 5, 8   ->  1, 4, 2, 5, 8
        *       ^
        *
        *   i = 1, j = 1
        *       1, 4, 2, 5, 8   ->  1, 2, 4, 5, 8 (already sorted)
        *          ^
        *
        *   i = 1, j = 2
        *       1, 2, 4, 5, 8   ->  1, 2, 4, 5, 8
        *             ^
        *
        *   ........
        *
        *
        *   i = 4, j = 0 (this is last loop for i; i < arr.length - 1)
        *       1, 2, 4, 5, 8   ->  1, 2, 4, 5, 8
        *       ^
        *
         */

        // 체크용
        for( int i = 0; i < unsortedArr.length; i++ ) {
            System.out.println(unsortedArr[i]);
        }
    }
}
