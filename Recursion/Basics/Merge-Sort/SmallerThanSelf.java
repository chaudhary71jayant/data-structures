
import java.util.*;

public class SmallerThanSelf {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] count = new int[n];
        int[][] arr = new int[n][2];

        // Pair each number with its original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        mergeSort(arr, 0, n - 1, count);

        for (int c : count) {
            list.add(c);
        }
        return list;
    }

    private void mergeSort(int[][] arr, int start, int end, int[] count) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid, count);
        mergeSort(arr, mid + 1, end, count);
        merge(arr, start, mid, end, count);
    }

    private void merge(int[][] arr, int start, int mid, int end, int[] count) {
        List<int[]> temp = new ArrayList<>();
        int i = start, j = mid + 1;
        int rightCount = 0;

        while (i <= mid && j <= end) {
            if (arr[i][0] <= arr[j][0]) {
                count[arr[i][1]] += rightCount;
                temp.add(arr[i++]);
            } else {
                rightCount++;
                temp.add(arr[j++]);
            }
        }

        while (i <= mid) {
            count[arr[i][1]] += rightCount;
            temp.add(arr[i++]);
        }

        while (j <= end) {
            temp.add(arr[j++]);
        }

        for (int k = start; k <= end; k++) {
            arr[k] = temp.get(k - start);
        }
    }

    public static void main(String[] args) {
        SmallerThanSelf solution = new SmallerThanSelf();
        int[] nums = {5, 2, 6, 1};
        List<Integer> result = solution.countSmaller(nums);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + result);
    }
}
