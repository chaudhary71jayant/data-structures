//leetcode 2461
import java.util.HashSet;

public class TwoFourSixOne{
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;

        System.out.print("The maximum sum is : " + maximumSubarraySum(nums, k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum=0,maxSum=0;
        int start=0,end=0;

        while(end<nums.length){
            while(set.contains(nums[end])){
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            sum+= nums[end];

            if(end-start+1 == k){
                maxSum = Math.max(maxSum,sum);
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            
            end++;
        }
        return maxSum;
    }
}