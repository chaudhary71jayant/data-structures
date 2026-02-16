//Leetcode problem 34 Find first and last index of the array

public class FindFistLast {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = searchRange(nums,target);

        System.out.println("Found the indexes as : ");
        for(int n : ans){
            System.out.print(n + " ");
        }
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);

        return ans;
    }

    static int search(int[] nums,int target,boolean findFirst){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            } else if(target>nums[mid]){
                start = mid+1;
            } else {
                ans = mid;
                if(findFirst){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
