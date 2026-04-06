//Count elements with maximum frequency

import java.util.HashMap;
import java.util.Map;

public class CountElements{
    public static void main(String[] args){
        int[] nums = {1,2,2,3,3,4,4,5,6};

        System.out.println("The maximum freq is : "+ maxFrequencyElements(nums));
    }
     public static int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxFreq =0;
        for(int num : nums){
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);

            maxFreq = Math.max(maxFreq,count);
        }

        int count=0;
        for(int freq : map.values()){
            if(freq == maxFreq) count++;
        }
        return count*maxFreq;
    }
}