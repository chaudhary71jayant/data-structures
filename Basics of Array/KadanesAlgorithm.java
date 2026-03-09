public class KadanesAlgorithm {
     public static int maxSubArray(int[] nums) {
        long sum =0,max = Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum=0;
            }
        }
        return (int) max;
    }

     public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    
}
