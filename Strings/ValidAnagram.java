// leetcode 242

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
       
        // Example test cases
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("hello", "bello"));     // false
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one, two);
    }
}
