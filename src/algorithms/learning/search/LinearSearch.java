package algorithms.learning.search;

public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = { 12, 4, 56, 65, 86, 69, 23, -2, 67, -9 };
        int answer = linearSearch(numbers, -2);
        boolean ans = linearSearch2(numbers, -99);
        System.out.println(answer);
        System.out.println(ans);
    }

    static int linearSearch(int[] array, int targetElement){
        if(array.length == 0){
            return -1;
        }

        for (int index = 0; index < array.length ; index++) {
            int element = array[index];
            if(element == targetElement){
                return index;
            }
        }

        return -1;
    }

    static boolean linearSearch2(int [] array, int targetElement){
        if(array.length == 0){
            return false;
        }

        for (int element : array) {
            if(element == targetElement){
                return true;
            }
        }
        return false;
    }
}
