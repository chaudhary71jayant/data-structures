//Leetcode 875
public class KokoEatingBanana {
    private static int calculateTotalHours(int[] piles, int speed) {
        int totalH = 0;
        for (int bananas : piles) {
            totalH += (bananas+speed-1)/speed;
        }
        return totalH;
    }

   
    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = Integer.MIN_VALUE;

        for(int num : piles){
            maxPile = Math.max(maxPile, num);
        }

       
        int start = 1,end = maxPile;
        int result = maxPile;

        
        while (start <=end) {
            int mid = (start +end) / 2;
            int totalH = calculateTotalHours(piles, mid);

           
            if (totalH <= h) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
     public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        
        System.out.println(minEatingSpeed(piles, h));
    }
}
