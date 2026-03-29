//Find the greatest number smaller than target

public class Floor {
   public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,14,16,18};
        int target = 15;

        int result = CeilingNum(arr, target);

        System.out.print("The floor of the number" + target + "is  : "+ arr[result]);
    }

    static int CeilingNum(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }

            
        }
        return end;
    }
}
