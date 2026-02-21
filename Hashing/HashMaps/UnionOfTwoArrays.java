//Union of two arrays with hashset
import java.util.HashSet;


public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4};
        int[] nums2 = {3,4,5,6,7,8};

        int[] res = union(nums1, nums2);
        System.out.print("The Union of the two arrays is : ");
        for(int n : res){
            System.out.print(n + " ");
        }
    }

    static int[] union(int[] nums1,int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }

        int[] unionArr = new int[set.size()];

        int i = 0;
        for (Integer num : set) {
            unionArr[i++] = num;
        }


        return unionArr;
    }
}
