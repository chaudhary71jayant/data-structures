//Leetcode 121

public class BuyandSellStocks {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE,maxProfit=0;
        
        for(int num : prices){
            if(num < min){
                min = num;
            }

            maxProfit = Math.max(maxProfit,num-min);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println("The maximum profit is : " + maxProfit(prices));
    }
}
