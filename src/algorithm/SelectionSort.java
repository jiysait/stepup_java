package algorithm;
/*
* Selection Sort is that sorts an array by repeatedly finding the minimum element from unsorted part,
* and putting it at the beginning.
* This algorithm maintains two sub-arrays in a given array.
*/
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int loopCount = 0;

        for( int i = 0; i < arr.length - 1; i++ ) { // 방 배정 포인터
            // 방 배정은 앞 쪽 부터 차례대로 작은 수가 넣어져 정리가 되어 왔다면
            // 제일 마지막 방보다 바로 앞 방까지만 정리하면 자동으로 마지막 방의 수는 정리가 되어지기 때문에
            // 마지막 방까지 루프를 돌릴 이유가 없기 때문이다
            int min_idx = i;
            for( int j = i + 1; j < arr.length; j++ ) { // 비교 대상 선택 포인터
                loopCount++;
                if(arr[min_idx] > arr[j]) {
                    // 키포인트는
                    // j 루프에서는 인덱스만 찾는 것이라는 것
                    min_idx = j;
                }
            }
            int tmp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tmp;
        }

        // 체크용
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "Loop Count: " + loopCount);
    }

}
