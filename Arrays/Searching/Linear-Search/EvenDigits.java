

//Leetcode Problem 1296

public class EvenDigits{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i=0;i<nums.length;i++){
            int digCount =0;
            while(nums[i]>0){
                nums[i] = nums[i]/10;
                digCount++;
            }
            if(digCount%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}