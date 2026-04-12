//Recursive Binary search Divide and conquer

public class RecursiveBinarysearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,88,89,90,99};
        int target = 88;
        System.out.print("The target is found at : " + bs(arr, target, 0, arr.length-1));
    }

    static int bs(int[] arr,int target,int start,int end){
        int mid = start+(end-start)/2;
        if(start>end){
            return -1;
        } else if(arr[mid] == target){
            return mid;
        } else if(arr[mid] > target){
            return bs(arr, target, start, mid-1);
        } 
        return bs(arr, target, mid+1, end);
    }
}
