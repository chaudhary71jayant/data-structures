import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountCompleteSubarray {
    public static void main(String[] args) {
        int[] nums = {1,3,1,2,2};

        System.out.print("The number of complete subarrays are : " + countCompleteSubarrays(nums));
    }

    public static int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        return equalsk(nums,set.size());
    }

    public static int equalsk(int[] nums, int k){
        return atmost(nums,k) - atmost(nums,k-1);
    }

    public static int atmost(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int start=0,end=0,count=0;

        while(end<nums.length){
            map.put(nums[end], map.getOrDefault(nums[end],0)+1);

            while(map.size() > k){
                map.put(nums[start], map.getOrDefault(nums[start],0)-1);
                if(map.get(nums[start])==0) map.remove(nums[start]);
                start++;
            }

            count += (end-start) + 1;
            end++;
        }
        return count;
    }
}
