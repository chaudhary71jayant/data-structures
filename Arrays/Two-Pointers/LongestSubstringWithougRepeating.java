//Leetcode Problem number 3

import java.util.HashSet;

public class LongestSubstringWithougRepeating {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxlen = 0;
        int n = s.length();

        while (right < n) {
            if (set.contains(s.charAt(right))) {
                // shrink window until duplicate is removed
                set.remove(s.charAt(left));
                left++;
            } else {
                // expand window
                set.add(s.charAt(right));
                maxlen = Math.max(maxlen, right - left + 1);
                right++;
            }
        }
        return maxlen;
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // Output: 3
    }
}
