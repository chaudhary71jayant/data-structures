// leetcode 240 Search in a 2D Matrix II

public class SearchIna2DArrayII {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };

        int target = 13;

        if(search(matrix, target)){
            System.out.println("Found in the array.");
        } else {
            System.out.println("Not Found in the array.");
        }

    }

    static boolean search(int[][] matrix,int target){
        int m = matrix[0].length,n=matrix.length;

        int row=0,col=n-1;
        while(row<m && col>=0){
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
