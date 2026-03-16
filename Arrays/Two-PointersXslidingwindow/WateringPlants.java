// leetcode 2079

public class WateringPlants {
    public static void main(String[] args) {
        int[] plants = {2,2,3,3};
        int capacity = 5;

        System.out.print("The steps in total are : " + wateringPlants(plants, capacity));
    }

    public static  int wateringPlants(int[] plants, int capacity) {
        int step = 0,initial=capacity;

        for(int i=0;i<plants.length;i++){
           if(capacity<plants[i]){
                step += i*2;
                capacity = initial;
           }
           capacity -= plants[i];
           step++;
        }
        return step;
    }
}
