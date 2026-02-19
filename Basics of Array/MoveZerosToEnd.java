//leetcode Problem 283

public class MoveZerosToEnd {
    static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }
    }

    static  void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,4,0,3,0,6,7,8};

        System.out.print("The array after moving all zeroes to end is : " + moveZeroes(nums));
    }
}
