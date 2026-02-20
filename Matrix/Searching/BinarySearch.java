package Matrix.Searching;

public class BinarySearch {
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

    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length-1;

        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[]{row,column};
            } else if(matrix[row][column]<target){
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
