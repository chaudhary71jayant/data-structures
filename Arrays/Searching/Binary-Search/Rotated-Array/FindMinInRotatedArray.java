//Leetcode problem 153 Find minimum in the rotated sorted array.

public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};

        System.out.println("The min in the sorted array is : "+ findMin(arr));
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(nums[mid]>nums[end]){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
