//this is the problem to find the lower bound even when the element is not in the array this will give the next element which would be at the position
// Also the solution for leetcode problem 35
public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {3,4,6,8,10};
        int target = 9;

        System.out.println("The lower bound of the target is : " + lower(nums, target));
    }

    static int lower(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<= nums[mid]){
                ans = mid;
                end = mid-1;
            } else {
                start = start+1;
            }
        }
        return ans;
    }
}
