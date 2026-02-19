public class UpperBound {
    static int upper(int[] nums,int target){
        int start =0;
        int end = nums.length-1;
        int ans = 0;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid] <=target){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,8,9,9,11};
        int target = 7;

        System.out.println("The upper bound found is : " + upper(nums, target));
    }
}
