//Leetcode Problem number 349

import java.util.HashSet;

public class IntersectionOfTwoArrays{
    public static void main(String[] args) {
        int[] nums1 = {2,3,4};
        int[] nums2 = {3,4,5,6,7,8};

        int[] res = intersection(nums1, nums2);
        System.out.print("The Intersection of the two arrays is : ");
        for(int n : res){
            System.out.print(n + " ");
        }
    }

    static  int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                resSet.add(num);
            }
        }

        int[] resArr = new int[resSet.size()];
        int i=0;
        for(int n : resSet){
            resArr[i++] = n;
        }
    return resArr;
    }
}
