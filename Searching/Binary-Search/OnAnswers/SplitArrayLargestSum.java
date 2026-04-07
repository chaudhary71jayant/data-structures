//Split array largest sum
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println("The minimized max sum of the array after spliting into " + k + " parts is : "+splitArray(nums, k));
    }

    public static int splitArray(int[] nums,int k){
        int start=0,end=0;

        for(int num : nums){
            start = Math.max(start, num);
            end += num;
        }

        while(start<end){
            int mid = start + (end-start)/2;

            int sum = 0,pieces=1;
            for(int num : nums){
                if(num+sum > mid){
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
