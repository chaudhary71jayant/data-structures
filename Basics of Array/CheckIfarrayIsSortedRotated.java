//leetcode Problem 1752

public class CheckIfarrayIsSortedRotated {
    static boolean check(int[] nums){
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 5, 1, 2};   // true
        int[] nums2 = {1, 2, 3, 4, 5};   // true
        int[] nums3 = {2, 1, 3, 4};      // false

        System.out.println(check(nums1));
        System.out.println(check(nums2));
        System.out.println(check(nums3));
    }

}
