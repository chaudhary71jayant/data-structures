//Leetcode problem 1004

public class MaxConsequtiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.print("We have maximum consequtive ones : " + findMax(nums, k));
    }

    public static int findMax(int[] nums,int k){
        int start=0,end=0,maxlen = 0,zeros = 0;

        while(end<=nums.length-1){
            if(nums[end] == 0){
                zeros++;
            }
            while(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }

            maxlen = Math.max(maxlen, end - start +1);
            end++;
        }
        return maxlen;
    }
}
