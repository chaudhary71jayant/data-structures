//Leetcode problem 154 where duplicates exsist in the array

public class FindMinInRotatedArrayII {
    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(nums[mid] < nums[end]){
                end = mid;
            } else if(nums[mid]> nums[end]){
                start = start+1;
            } else {
                end--;
            }
        }
        return nums[start];
    }

    public static void main(String[] args){
        int[] nums = {2,2,2,0,2,2};

        System.out.println("The min in the sorted rotated array is  : " + findMin(nums));
    }
}