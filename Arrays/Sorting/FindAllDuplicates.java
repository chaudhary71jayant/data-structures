//Leetcode 442
import java.util.*;

public class FindAllDuplicates {
    
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        // After cyclic sort, duplicates will remain in wrong positions
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicates: " + duplicates);
    }
}