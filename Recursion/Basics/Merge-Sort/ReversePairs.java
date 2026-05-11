import java.util.*;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int start, int end) {
        if (start >= end) return 0;

        int mid = start + (end - start) / 2;
        int count = 0;

        count += mergeSort(arr, start, mid);
        count += mergeSort(arr, mid + 1, end);
        count += countPairs(arr, start, mid, end);

        merge(arr, start, mid, end);
        return count;
    }

    private int countPairs(int[] arr, int start, int mid, int end) {
        int count = 0;
        int right = mid + 1;

        for (int i = start; i <= mid; i++) {
            while (right <= end && (long) arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }

        // Debug print for trace
        System.out.println("CountPairs between [" + start + "," + mid + "] and [" + (mid+1) + "," + end + "] = " + count);
        return count;
    }

    private void merge(int[] arr, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int i = start, j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i++]);
            } else {
                temp.add(arr[j++]);
            }
        }

        while (i <= mid) temp.add(arr[i++]);
        while (j <= end) temp.add(arr[j++]);

        for (int k = start; k <= end; k++) {
            arr[k] = temp.get(k - start);
        }

        // Debug print for trace
        System.out.println("Merged [" + start + "," + end + "]: " + Arrays.toString(Arrays.copyOfRange(arr, start, end+1)));
    }

    public static void main(String[] args) {
        ReversePairs solution = new ReversePairs();
        int[] nums = {2, 4, 3, 5, 1};
        System.out.println("Input: " + Arrays.toString(nums));
        int result = solution.reversePairs(nums);
        System.out.println("Reverse Pairs Count = " + result);
    }
}
