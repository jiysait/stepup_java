package algorithm;
/*
* Bubble sort works by swapping the adjacent elements if they are in wrong order
*/
public class BubbleSortOpt {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int loopCount = 0;

        for( int i = 0; i < arr.length - 1; i++ ) {
            int sortCount = 0;
            for( int j = 0; j < arr.length - i - 1; j++ ) {
                loopCount++;
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    sortCount++;
                }
            }
            if(sortCount == 0) {
                break;
            }
        }

        // 체크용
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "Loop Count: " + loopCount);
    }

}
