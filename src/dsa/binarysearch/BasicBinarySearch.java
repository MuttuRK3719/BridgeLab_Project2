package dsa.binarysearch;

public class BasicBinarySearch {
    public static void main(String[] args) {
    int []arr={1,2,4,7,9,11,13,15,17};
        System.out.println(search(arr,11));
    }

    static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
