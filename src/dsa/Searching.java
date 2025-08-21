package dsa;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(binarySearch(arr, 7));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if (arr[start] <= arr[mid]) {
                if (arr[start] < target && arr[mid] > target) {
                    end = mid - 1;
                } else start = mid + 1;
            } else {
                if (arr[end] > target && arr[mid] < target) {
                    start = mid + 1;
                } else end = mid - 1;
            }
        }
        return -1;
    }
}
