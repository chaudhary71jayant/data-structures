//Leetcode 1283

public class SmallestThreshold {
    public static  int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            max = Math.max(max,num);
        }

        int start = 1,end=max;
        int result = max;

        while(start<=end){
            int mid = start+(end-start)/2;
            int s = divison(nums,mid);

            if(s<=threshold){
                result = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return result;
    }

    public static  int divison(int[] nums,int divisor){
        int sum=0;
        for(int num : nums){
            sum += (num+divisor-1)/divisor;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;

        System.out.print("The smallest divisor possible is " + smallestDivisor(nums, threshold));

    }
}
