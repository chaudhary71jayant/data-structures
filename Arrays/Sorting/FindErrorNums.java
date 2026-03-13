//Leetcode 645

public class FindErrorNums {
    
    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        
        // Cyclic sort
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find duplicate and missing
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans[0] = nums[index];       // duplicate
                ans[1] = index + 1;         // missing
            }
        }
        return ans;
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 2, 4};
        
        // Call the function
        int[] ans = findErrorNums(nums);
        
        // Print the result
        System.out.println("Duplicate: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}