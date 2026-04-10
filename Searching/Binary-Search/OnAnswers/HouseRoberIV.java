//House robber IV with the range finding Binary search plus greedy.
public class HouseRoberIV {
    public static void main(String[] args){
        int[] num = {2,7,9,3,1};
        int k = 2;

        System.out.println("The minimum capacity needed for the robber is : " + minCapability(num, k));
    }

    public static int minCapability(int[] nums, int k) {
        int start = min(nums),end=max(nums),ans=0;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(canRob(nums,mid,k)){
                ans=mid;
                end=mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }

    public static boolean canRob(int[] nums,int mid,int k){
        int cap = mid,i=0,count=0;

        while(i<nums.length){
            if(nums[i] <= mid){
                count++;
                i+=2;
            } else {
                i++;
            }
        }
        return count>=k;
    }

    public static int min(int[] nums){
        int minimum=Integer.MAX_VALUE;
        for(int num : nums){
            if(num<minimum) minimum=num;
        }
        return minimum;
    }

    public static int max(int[] nums){
        int maximum=Integer.MIN_VALUE;
        for(int num : nums){
            if(num>maximum) maximum=num;
        }
        return maximum;
    }
}
