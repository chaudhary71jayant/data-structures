package Matrix.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] nums = {
            {3,4,5},
            {6,7,8},
            {9,10,12}
        };
        int target = 8;

        int[] res = search(nums, target);

        for(int r : res){
            System.out.print(r + " ");
        }
    }

    static int[] search(int[][] nums,int target){
        for(int row =0;row<nums.length;row++){
            for(int column = 0;column < nums[row].length;column++){
                if(nums[row][column] == target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
