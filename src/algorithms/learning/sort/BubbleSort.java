package algorithms.learning.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 1, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
