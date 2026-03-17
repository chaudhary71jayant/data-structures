//Leetcode 930

import java.util.HashMap;

public class BinarySubarrayWithSum {
    static int subarraySum(int[] nums,int goal){
        int count=0;
        int[] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            if(prefixSum[j] == goal){
                count++;
            }

            int val = prefixSum[j] - goal;
            if(map.containsKey(val)){
                count+= map.get(val);
            }
            map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;

        System.out.print("The numbers of subarrays are : " + subarraySum(nums, goal));
    }
}
