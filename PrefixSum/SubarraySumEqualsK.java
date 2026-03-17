
import java.util.HashMap;
import java.util.Map;

//Leetcode 560

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        int[] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];        
        }

        for(int j=0;j<nums.length;j++){
            if(prefixSum[j] == k){
                count++;
            }

            int val = prefixSum[j] - k;
            if(map.containsKey(val)){
                count += map.get(val);
            }

            
            map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;

        System.out.print("The number of subarray with sum equals k are : "+ subarraySum(nums, k));
    }
}
