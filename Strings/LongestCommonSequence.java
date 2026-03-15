//Leetcode 14 

public class LongestCommonSequence {
    public static void main(String[] args) {
    

        // Example test cases
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        String[] strs3 = {"interspecies","interstellar","interstate"};

        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println(longestCommonPrefix(strs2)); // Output: ""
        System.out.println(longestCommonPrefix(strs3)); // Output: "inters"
    }



    public static  String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }

    // Single method to compare two strings
    private static String commonPrefix(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        int i = 0;
        while (i < minLen && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        return s1.substring(0, i);
    }
}
