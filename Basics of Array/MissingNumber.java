

public class MissingNumber {
    public static void main(String[] args) {
        

        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums));
    }

    static  int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = arrSum(nums);
        int sumNeeded = neededSum(n);

        return sumNeeded-actualSum;
    }

    static int arrSum(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }

    static  int neededSum(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
