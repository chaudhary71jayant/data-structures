//Leetcode 188

public class SingleNumber{
    static int singleNumber(int[] nums) {
        

        int Xor = 0;
        for(int num : nums){
            Xor ^= num;
        }
        return Xor;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("The single number found is : " + singleNumber(nums));
    }
}