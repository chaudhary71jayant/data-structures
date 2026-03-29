//Leetcode 41

public class FirstMissingPositive{
    public static int firstPositive(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] <= 0 || nums[i]> nums.length){
                i++;
            } else {
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                } else {
                    i++;
                }
            }
        }

        for (int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] != idx+1){
                return idx+1;
            }    
        }
        return nums.length+1;
    }

    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0};

        System.out.print("The first missing positive number is : " + firstPositive(nums));

    }
}