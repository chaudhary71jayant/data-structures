//Container with most water, Two pointers and greedy problem.
public class ContainerWithMostWater{
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println("The Maximum area is : " + maxArea(height));
    }

    public static int maxArea(int[] height){
        int start=0,end=height.length-1,area=0,maxArea=0;

        while(start<end){
            if(height[start] >= height[end]){
                area = height[end] * (end-start);
                end--;
            } else {
                area = height[start] * (end-start);
                start++;
            }
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}