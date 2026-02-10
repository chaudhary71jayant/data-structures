public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,5,7,9};

        int target = 7;

        System.out.print("The number is found at index : " + search(arr,target));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
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
}
