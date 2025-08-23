package dsa.binarysearch;

public class RightmostPosition {
    public static void main(String[] args) {
        int []arr={1,2,4,7,9,11,11,11,13,13,13,13,15,17};
        System.out.println(search(arr,13));
    }
    static int search(int[]arr,int target){
    int left=0,right=arr.length-1;
    while(left<right){
        int mid=left+(right-left)/2;
        if(arr[mid]<=target)left=mid+1;
        else right=mid;
    }
    return left-1;
    }

}
