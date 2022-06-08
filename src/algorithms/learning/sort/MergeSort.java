package algorithms.learning.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Given : { " + Arrays.toString(numbers) + " }");
        mergeSort(numbers);
        System.out.println("Sort : { " + Arrays.toString(numbers) + " }");
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length < 2) {
            return;
        }

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < length; i++) {
            rightArray[i - mid] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        mergeArray(array, leftArray, rightArray);
    }

    private static void mergeArray(int[] array, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if(leftArray[i] <= rightArray[j]){
                array[k++] = leftArray[i++];
            }else{
                array[k++] = rightArray[j++];
            }
        }

        while( i < leftLength){
            array[k++] = leftArray[i++];
        }

        while (j < rightLength){
            array[k++]= rightArray[j++];
        }
    }


//    public static void mergeSort(int[] array, int startIndex, int endIndex) {
//
//        if ((endIndex - startIndex) < 2) {
//            return;
//        }
//
//        int midIndex = (endIndex + startIndex) / 2;
//        mergeSort(array, startIndex, midIndex);
//        mergeSort(array, midIndex + 1, endIndex);
//        merge(array, startIndex, midIndex, endIndex);
//    }
//
//    private static void merge(int[] array, int startIndex, int midIndex, int endIndex) {
//
//        int i = startIndex;
//        int j = midIndex + 1;
//        int k = 0;
//
//        //create temp array
//        int[] tempArray = new int[endIndex - startIndex + 1];
//
//        // compare both array and merge
//        while (i <= midIndex && j <= endIndex) {
//            if (array[i] < array[j]) {
//                tempArray[k++] = array[i++];
//            } else {
//                tempArray[k++] = array[j++];
//            }
//        }
//
//        // marge remaining elements
//        if (i > midIndex) {
//            while (j <= endIndex) {
//                tempArray[k++] = array[j++];
//            }
//        } else {
//            while (i <= midIndex) {
//                tempArray[k++] = array[i++];
//            }
//        }
//
//        //copy temp in to main array
//        for (int l = 0; l < tempArray.length; l++) {
//            array[startIndex++] = tempArray[l];
//        }
//    }
}
