
import java.util.HashMap;
import java.util.Map;

public class ContinousSubarraySum {
    public static boolean  exist(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum%k;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(i-index >=2) return true;
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;

        if(exist(nums, k)){
            System.out.println("The good subarray exist.");
        } else {
            System.out.println("The good subarray does'nt exsist.");
        }
    }
}
