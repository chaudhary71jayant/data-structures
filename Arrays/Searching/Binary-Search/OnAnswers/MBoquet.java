//Leetcode 1482 Minimum Days to make m boquets

public class MBoquet {
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,result=-1;
        if(m*k > n) return -1;

        for(int num : bloomDay){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }

        int start=min,end=max;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(canMake(bloomDay,m,k,mid)){
                result = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return result;
    }

    public static boolean canMake(int[] bloomDay,int m,int k,int day){
        int boquet=0,flower=0;

        for(int num : bloomDay){
            if(num <= day){
                flower++;
                if(flower == k){
                    boquet++;
                    flower=0;
                    if(boquet == m){
                        return true;
                    }
                }
            } else {
                flower = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int result = minDays(bloomDays, k, m);
        if (result == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + result);
    }
    }
}
