
import java.util.HashMap;

//Leetcode 2958

public class LongestSubarrayWithAtMostK {
    public static int lengthOfArray(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int start=0,end=0,maxlen=0;

        while(end<nums.length){
            map.put(nums[end], map.getOrDefault(nums[end], 0)+1);

            while(map.get(nums[end])>k){
                map.put(nums[start],map.get(nums[start])-1);
                start++;
            }
            maxlen = Math.max(maxlen, end-start+1);
            end++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k = 2;

        System.out.print("The max subarray is : " + lengthOfArray(nums, k));
        
    }
}
