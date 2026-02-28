//Leetcode 485

public class MaxConsequtiveOnes {
    static int findMax(int[] nums){
        int count=0,maxCount=0;
        for(int n : nums){
            if(n==1){
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        System.out.println("The max Consequtive ones in the array are : " + findMax(nums));
    }
}
