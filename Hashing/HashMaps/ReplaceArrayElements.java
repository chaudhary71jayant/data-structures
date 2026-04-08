/*Replace array Elements classic Hashing question
where we can apply chaining by storing the operations in the map and then iterating over nums replacing the numbers present in the map with final form of them with a helper function, but that will give us the TLE so it is better to store the nums in the hashmap */


import java.util.HashMap;

public class ReplaceArrayElements{
    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int[][] operations = {{1,3},{4,7},{6,1}};

        int [] answer = arrayChange(nums,operations);

        System.out.print("The array after change is : ");
        for(int num : answer){
            System.out.println(" "+num);
        }
    }

    public static int[] arrayChange(int[]nums,int[][]operations){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int[] op : operations){
            int oldVal = op[0];
            int newVal = op[1];

            int index = map.get(oldVal);
            nums[index] = newVal;

            map.put(newVal, index);
        }
        return nums;
    }
}