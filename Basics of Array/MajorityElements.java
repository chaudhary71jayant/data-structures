//Leetcode problem number 169
import java.util.*;
public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {3,3,4};

        System.out.print("The majority element is : "+ majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int mid = nums.length/2;

        return nums[mid];
    }
}
