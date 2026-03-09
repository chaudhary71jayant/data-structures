//Leetcode 1299
public class leader {
     public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1; // last element is always -1

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            if (temp > maxRight) {
                maxRight = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,4,5,6,1};

        int[] newArr =  replaceElements(arr);

        System.out.print("The new Array we got is : ");
        for(int num : newArr){
            System.out.print(num + " ");
        }


    }
}
