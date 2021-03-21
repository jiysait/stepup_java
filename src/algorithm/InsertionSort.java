package algorithm;
/*
* Insertion Sort works based on the array virtually split into a sorted and an unsorted part.
* Values from the unsorted part are picked and placed at the correct position in the sorted part.
*/
public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        int loopCount = 0;

        for( int i = 1; i < arr.length; i++ ) { // key pointer
            int key = arr[i];
            int j = i - 1; // 왼쪽 옆 요소를 비교 대상으로 지정한다

            while(j >= 0 && arr[j] > key) {
                // 비교가 시작하자마자 key의 값 보다 왼쪽 옆 요소가 더 작으면 더이상 루프를 진행 할 이유가 없다
                // 왜냐하면 key를 기준으로 왼쪽은 밖의 루프를 돌면서 오름차순으로 정리가되어지고 있는 sub array 이기 때문이다
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            /*
                for( int j = i - 1; j >= 0; j-- ) {
                    if(arr[j] > key) {
                        arr[j + 1] = arr[j];
                        if (j == 0) {
                            arr[j] = key;
                        }
                    } else {
                        arr[j + 1] = key;
                        break;
                    }
                }
            */
        }

        // 체크용
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "Loop Count: " + loopCount);
    }

}
