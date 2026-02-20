//Leetcode Problem no. 75

package Matrix.Searching;

public class SearchIna2Dmatrix {
    public static void main(String[] args) {
        int[][] nums = {
            {3,4,5},
            {6,7,8},
            {9,10,12}
        };
        int target = 8;

        if(searchMatrix(nums, target)){
            System.out.println("The element is found.");
        } else {
            System.out.println("The element is not found.");
        }
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int start = 0,end = rows*columns-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int row = mid/columns;
            int col = mid%columns;
            int midVal = matrix[row][col];

            if(midVal == target) return true;
            else if(midVal < target) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
}
