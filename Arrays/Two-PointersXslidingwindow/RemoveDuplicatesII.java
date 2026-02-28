//Leetcode Problem 80

public class RemoveDuplicatesII {
    static int removeDuplicates(int[] nums){
        int start =2;
        for(int end=2;end<nums.length;end++){
            if(nums[start] != nums[end]) {
                nums[start] = nums[end];
                start++;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] expectedNums = {1,1,2,2,3};

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}