package algorithm;

/**
 * Quick Sort is a Divide and Conquer algorithm.
 * It picks an element as pivot and partitions the given array around the picked pivot.
 */

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};

        quickSort(arr, 0, arr.length - 1);

        // 체크용
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
//            System.out.println("pivot index: " + pi + " fixed prev pivot: " + arr[pi]);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
//        {10, 80, 30, 90, 40, 50, 70};
        // rightmost will be a pivot
        int pivot = arr[high];

        int arranger = low - 1;

        for( int i = low; i < high; i++ ) { // 피벗과 모든 원소를 비교해야 하므로
            if(arr[i] <= pivot) {
                arranger++;
                // 중요한 것은 피벗이 매 비교 때마다 자리를 바꾸는 것이 아니라는 것이다
                int tmp = arr[i];
                arr[i] = arr[arranger];
                arr[arranger] = tmp;
            }
        }
        // 위 루프가 끝나면 순서대로 정리가 된 것이 아니라 피벗을 기준으로 그냥 왼쪽 오른쪽으로 구분만 된 것이다
        // 정리가 이루어지는 원리는 리커시브 콜에 의해 파티션이 작아지고,
        // 가장 작은 1 사이즈의 배열 [el] 일 때 조건문에 의해 필터되는 과정을 통해 가장 작은 단위까지 분해되어 다시 올라오면서
        // 피벗들이 고정되고 이 피벗들이 고정된 결과 모든 배열의 원소들이 정렬되는 것이다.
        int tmp = arr[arranger + 1];
        arr[arranger + 1] = pivot;
        arr[high] = tmp;

        return arranger + 1;
    }

}
