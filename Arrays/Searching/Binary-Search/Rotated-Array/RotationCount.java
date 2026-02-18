//FInd the roatation count in a rotated sorted array Input arr = {15,18,2,3,6,12}, output 2

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {15,18,2,3,6,12};

        System.out.print("The array is rotated by : " + rotationCount(nums));
    }

    static int rotationCount(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid+1; 
            } else {
                end = mid;
            }
        }
        return start;
    }
}
