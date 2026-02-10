//Leetcode problem 1672

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{3,6}};

        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int ans =0;
        for(int row=0;row<accounts.length;row++){
            int sum =0;
            for(int col=0;col<accounts[row].length;col++){
                sum += accounts[row][col];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        
        return ans;
    }
}
