package algorithms.learning.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Given : { " +Arrays.toString(array) +" }");
        mergeSort(array, 0, array.length -1);
        System.out.println("Sorted : { " +Arrays.toString(array) +" }");
    }

    public static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midIndex = (endIndex + startIndex )/ 2;
            mergeSort(array, startIndex, midIndex);
            mergeSort(array, midIndex + 1, endIndex);
            merge(array, startIndex, midIndex, endIndex);
        }
    }

    private static void merge(int[] array, int startIndex, int midIndex, int endIndex) {

        int i = startIndex;
        int j = midIndex + 1;
        int k = 0;

        //create temp array
        int[] tempArray = new int[endIndex - startIndex + 1];

        // compare both array and merge
        while (i <= midIndex && j <= endIndex) {
            if (array[i] < array[j]) {
                tempArray[k] = array[i];
                i++;
            } else {
                tempArray[k] = array[j];
                j++;
            }
            k++;
        }

        // marge remaining elements
        if (i > midIndex) {
            while (j <= endIndex) {
                tempArray[k] = array[j];
                k++;
                j++;
            }
        } else {
            while (i <= midIndex) {
                tempArray[k] = array[i];
                k++;
                i++;
            }
        }

        //copy temp in to main array
        for (int l = 0; l < tempArray.length; l++) {
            array[startIndex] = tempArray[l];
            startIndex++;
        }
    }
}
