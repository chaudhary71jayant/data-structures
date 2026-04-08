public class MaximumAverageSum{
    public static double findMaxAverage(int[] nums,int k){
        int start=0,end=k-1;
        double maxAvg = Double.NEGATIVE_INFINITY;

        while(end<nums.length){
            double avg = average(nums, start, end, k);
            maxAvg = Math.max(maxAvg, avg);
            start++;
            end++;
        }
        return maxAvg;
    }

    public static double average(int[] nums,int start,int end,int k){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum += nums[i];
        }
       return (double)sum/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println("The maximum average is : " +  findMaxAverage(nums, k));
    }
}