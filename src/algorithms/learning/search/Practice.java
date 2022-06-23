package algorithms.learning.search;

public class Practice {
    public static void main(String[] args) {
        int x = 11;
        System.out.print(sqrtRootUsingBS(x));
    }

    private static int sqrtRootUsingBS(int num) {
        int start = 0, end = num, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            }
            if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }


    // Time Complexity O(n)
    private static int sqrtRootBrutForce(int x) {
        if (x == 0 || x == 1) return x;
        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    //Count of occurrences of x in sorted element
    public static int countOfOccurrences(int[] arr, int n, int target) {
        int start = 0, end = n - 1;
        int midIndex = 0; // call below binary search
        int rSide = midIndex + 1;
        int element = arr[midIndex];
        int count = 1;
        while (rSide < n && arr[rSide] == target) {
            count++;
            rSide++;
        }
        int lSide = midIndex - 1;
        while (lSide >= 0 && arr[lSide] == target) {
            count++;
            lSide--;
        }
        return count;
    }

    // get first and last TC: O(n)
    public static void findFirstAndLast(int arr[], int x) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x != arr[i]) continue;
            if (first == -1) first = i;
            last = i;
        }
    }

    // get first TC: O(log n)
    public int getFirst(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (target == arr[mid] && arr[mid - 1] < target) {
            return mid;
        } else if (target > arr[mid]) {
            getFirst(arr, mid + 1, end, target);
        } else {
            getFirst(arr, start, mid - 1, target);
        }
        return -1;
    }

    // get last TC: O(log n)
    public int getLast(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (target == arr[mid] && arr[mid + 1] > target) {
            return mid;
        } else if (target > arr[mid]) {
            getFirst(arr, mid + 1, end, target);
        } else {
            getFirst(arr, start, mid - 1, target);
        }
        return -1;
    }
}
