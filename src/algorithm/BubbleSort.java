package algorithm;
/*
* Bubble sort works by repeatedly swapping the adjacent elements if they are in wrong order
*
* adjacent [어제이썬트]
* close to, next to
*/
public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArr = {5, 1, 4, 2, 8};
        int loopCount = 0;

        for( int i = 0; i < unsortedArr.length - 1; i++) {
            for (int j = 0; j < unsortedArr.length - i - 1; j++) {
                loopCount++;
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
        * ====================================================================
        * 위 과정을 통해 가장 큰 수는 제일 오른쪽으로 배정되었다
        * 가장 왼쪽에서부터 시작된 포인터는 다음 인덱스를 가르킬 때 비교 값이 커서 위치를 바꾼 수라면,
        * 다시 한번 더 포인터가 가르키는 수가 되는 것이고 이것이 반복되면서 가장 큰 수는 j 루프가 돌면서
        * 가장 오른쪽으로 밀려나게 되기 때문이다
        * 이 때 i 루프는 해당 배열의 방 수 (length - 1) 만큼 돌아야 오른쪽 (큰 수) 부터 정렬되는
        * 모든 수를 담을 수 있기 때문에 외부 루프로 돌리며, j 루프는 i 루프가 돌면서 오른쪽으로 부터
        * 하나 하나의 값을 채워 나가기 때문에 정렬되지 않은 대상들이 남아 있는 공간만을 대상으로 하게되며,
        * 이 때문에 i 를 빼준 배열의 길이 만큼을 최대 값으로 가진다
         * ====================================================================
        *
        *   i = 1, j = 0
        *       1, 4, 2, 5, 8   ->  1, 4, 2, 5, 8
        *       ^
        *
        *   i = 1, j = 1
        *       1, 4, 2, 5, 8   ->  1, 2, 4, 5, 8 (already sorted)
        *          ^
        *
        *   i = 1, j = 2 (this is the last loop for j in this 'i' loop; j < arr.length - i - 1)
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
            System.out.print(unsortedArr[i] + " ");
        }
        System.out.println("\n" + "Loop Count: " + loopCount);
    }
}
