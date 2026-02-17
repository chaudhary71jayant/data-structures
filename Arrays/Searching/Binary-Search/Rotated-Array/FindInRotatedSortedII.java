//Leetcode Problem 81 find in rotated sorted array 2


public class FindInRotatedSortedII {
    static boolean search(int[] nums,int target){
        int start = 0,end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid] == target) return true;
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start++;
                end--;
            } else if(nums[mid]>= nums[start]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target <= nums[end] && target > nums[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,2,3,9,9,9,9,9,9};
        int target = 7;

        if(search(arr, target)){
            System.out.println("The element is present in the array.");
        } else {
            System.out.println("The element is not present in the array.");
        }
    }
}
