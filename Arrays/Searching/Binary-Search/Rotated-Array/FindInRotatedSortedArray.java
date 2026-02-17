// leetcode Problem 33. Search in Rotated sorted array.

public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 1;

        System.out.println("The Pivot is found at : " + findPivot(arr));
    

        if(search(arr, target) == -1){
            System.out.println("Element not found.");
        } else {
            System.out.println("The element is found at index : " + search(arr, target));
        }
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(binarySearch(nums,0,pivot-1,target) !=-1){
            return binarySearch(nums, 0, pivot-1, target);
        } else {
            return binarySearch(nums, pivot, nums.length-1, target);
        }
    }

    static int binarySearch(int[] nums,int start,int end,int target){
         while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(target<nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[end]){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return start;
    }

}
