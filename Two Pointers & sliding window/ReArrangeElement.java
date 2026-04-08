//leetcode 2149 re arrange element by sign

public class ReArrangeElement{
    public static  int[] rearrangeArray(int[] nums) {
        int n = nums.length,pos=0,neg=1,i=0;
        int[] arr = new int[n];

        while(i<n){
            if(nums[i]<0){
                arr[neg] = nums[i];
                neg = neg+2;
            } else {
                arr[pos] = nums[i];
                pos = pos+2;
            }
            i++;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};

        int[] newNums = rearrangeArray(nums);

        System.out.print("The array after rearranging is : ");
        for(int num : newNums){
            System.out.print(num + " ");
        }
    }
}