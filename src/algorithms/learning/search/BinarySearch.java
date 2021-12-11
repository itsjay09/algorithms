package algorithms.learning.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array  = {1, 2, 4, 34, 56 ,78 ,99,101, 223, 667};
        int[] arrayDesc  = {115, 99, 79, 56, 23, 11, 3 ,-4};
        int target = -4;
        int result = orderAgnosticBinarySearch(arrayDesc, target);
        System.out.println(result);

    }

    // logic applied when array is sorted and descending order
    public static int binarySearch(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length - 1;


        while (startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;

            if(target < array[midIndex]){
                endIndex = midIndex - 1;
            }else if(target > array[midIndex]){
                startIndex = midIndex + 1;
            }else{
                return midIndex;
            }

        }
        return -1;
    }

    // Work for sorted array ascending and descending order
    public static int orderAgnosticBinarySearch(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length - 1;

        boolean isAscending = array[startIndex] < array[endIndex];

        while (startIndex <= endIndex){
            int mid = startIndex + (endIndex  - startIndex) / 2;

            if(target == array[mid]){
                return mid;
            }

            if(isAscending){
                if(target < array[mid]){
                    endIndex = mid -1;
                }else{
                    startIndex = mid + 1;
                }
            }else{
                if(target > array[mid]){
                    endIndex = mid - 1;
                }else {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }

}
