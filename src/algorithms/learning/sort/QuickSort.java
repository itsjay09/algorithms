package algorithms.learning.sort;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        print(numbers);
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println();
        System.out.println("After sort");
        print(numbers);


    }

    public static void quickSort(int[] arr, int startIndex, int endIndex){

        if(startIndex >= endIndex){
            return;
        }

        int pivot = arr[endIndex];
        int leftPointer = startIndex;
        int rightPointer = endIndex;

        while (leftPointer < rightPointer){

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, endIndex);

        quickSort(arr, startIndex, leftPointer - 1 );
        quickSort( arr, leftPointer + 1, endIndex);
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ,");
        }
    }
}
