//Problem 1095 find in a mountain array

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int target = 3;

        System.out.println("The element is found at the index : " + findinMtarray(arr, target));


    }

    static int findinMtarray(int[] arr, int target){
        int peakIndx = findPeakElement(arr);

        int start =0;
        int end = arr.length-1;

        if(ascSearch(arr, target, start, peakIndx)!= -1){
            return ascSearch(arr, target, start, peakIndx);
        } else {
            return dscSearch(arr, target, peakIndx, end);
        }
    }

   

    static int ascSearch(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] < target){
                start = mid+1;
            } else if(arr[mid]>target){
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }

     static int dscSearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] < target){
                end = mid-1;
            } else if(arr[mid]>target){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }



    static int findPeakElement(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int mid = start+(end-start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}
