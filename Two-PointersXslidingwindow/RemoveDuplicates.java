//Leetcode Problem 26

public class RemoveDuplicates {
    static int removeDuplicates(int[] nums){
        int start =0;
        for(int end=1;end<nums.length;end++){
            if(nums[start] != nums[end]) {
                start++;
                nums[start] = nums[end];
            }
        }
        return start+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2,2};

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}