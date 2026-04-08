//Leetcode 2105
public class WateringPlantsII {
    public static void main(String[] args){
        int[] plants = {2,2,3,3};
        int capacityA = 5,capacityB =5;

        System.out.print("The number of refills needed to do are : "+ minimumRefill(plants, capacityA, capacityB));
    }

    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int count=0,start=0,end=plants.length-1,initialA=capacityA,initialB=capacityB;

        while(start<end){
            

            if(capacityA < plants[start]){
                capacityA = initialA;
                count++;
            }
            capacityA -= plants[start];
            start++;

            if(capacityB < plants[end]){
                capacityB = initialB;
                count++;
            }
            capacityB -= plants[end];
            end--;
        }
        if(start == end && Math.max(capacityA,capacityB) < plants[start]){
            count++;
        }
        return count;
    }
    
}
