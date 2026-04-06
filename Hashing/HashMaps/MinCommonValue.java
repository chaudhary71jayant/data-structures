import java.util.HashSet;

public class MinCommonValue {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] nums2 = {2,4};

        System.out.println("The minimum common is : " + getCommon(nums2, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num))
                return num;
        }
        return -1;
    }

}
