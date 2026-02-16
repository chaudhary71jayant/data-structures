//GFG question search in a infinite sorted array

public class InfiniteArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,26,29};
        int target = 5;

        System.out.println("Found at the index : " + ans(arr, target));

    }
    
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;


        while( target > arr[end]){
            int tempStart = end+1;
            // end = previous end + size of the box * 2;
            end = end + (end-start+1) * 2;
            start = tempStart;
        }

        return search(arr, target, start, end);


    }

    static int search(int[] arr,int target,int start,int end){
         while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target<arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }
}
