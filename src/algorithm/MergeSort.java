package algorithm;

/**
 * Merge Sort is a Divide and Conquer algorithm.
 * It divides the input array into two halves,
 * calls itself for the two halves,
 * and then merges the sorted two halves.
 *
 * 키포인트
 * 1. 재귀함수로 구현해야된다(재귀함수라 함은 자신 안에서 자신을 부르며 반드시 조건을 검사하는 부분을 포함한다)
 * 2. 왼쪽부터 처리된다 (이 점은 합병정렬 함수가 재귀콜이면서도 리턴값이 없는 이해하는데 참~ 불편하게 만드는 주요 원인)
 * 3. 같은 소그룹(left or right) 안에 있는 원소끼리는 이미 정렬되어 있으므로 합병시 한쪽에 원소들이 모두 남아 있다면 생각 할 것 없이 그냥 연속으로 읽으면 된다
 * 4. For문 동작이 이상하게 된다 While 문을 사용하는 것이 여러모로 유용하다
 */

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10, 3};

        mergeSort(arr, 0, arr.length - 1);

        // 체크용
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if(r > l) { // 2개 이상의 엘레먼트가 있음; 즉 두 파트로 나뉠 수 있음
            int m = (l + r) / 2; // 간혹 l + (r - l) / 2 라고 해석한 것들이 있는데 이는 C 언어에서 오버플로우를 막기 위함이라고 한다.
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int left_len = (m - l) + 1;
        int right_len = r - m;
        int[] left = sliceArray(arr, l, left_len);
        int[] right = sliceArray(arr, m + 1, right_len);

        int left_p = 0;
        int right_p = 0;
        int i = l;

        while(i < r) {
            if(left[left_p] <= right[right_p]) {
                arr[i] = left[left_p];
                left_p++;
            } else {
                arr[i] = right[right_p];
                right_p++;
            }
            i++;
        }

        while(left_p < left_len) {
            arr[i] = left[left_p];
            left_p++;
            i++;
        }

        while(right_p < right_len) {
            arr[i] = right[right_p];
            right_p++;
            i++;
        }
    }

    // 도움 함수 (별로 중요하지 않음)
    public static int[] sliceArray(int[] arr, int start, int length) {
        int[] slice = new int[length];
        for( int i = 0; i < length; i++ ) {
            slice[i] = arr[start + i];
        }
        return slice;
    }

}
