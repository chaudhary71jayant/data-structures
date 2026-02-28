// leetcode 904 Fruits into basket

import java.util.*;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {1,2,1};

        System.out.println("The max fruits are : "+ totalFruits(fruits));
    }

    static int totalFruits(int[] fruits){
        HashMap<Integer,Integer> basket = new HashMap<>();

        int start=0,end=0,maxlen=0;

        while(end<=fruits.length-1){
            basket.put(fruits[end], basket.getOrDefault(fruits[end],0)+1);

            while(basket.size()>2){
                basket.put(fruits[end],basket.get(fruits[start])-1);
                if(basket.get(fruits[start]) == 0){
                    basket.remove(start);
                }
                start++;
            }
            maxlen = Math.max(maxlen, end-start+1);
            end++;
        }
        return maxlen;
    }
}
