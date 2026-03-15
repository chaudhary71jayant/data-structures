//Leetcode 796
public class Main {
    public static void main(String[] args) {
        

        System.out.println(rotateString("abcde", "cdeab")); // true
        System.out.println(rotateString("abcde", "abced")); // false
        System.out.println(rotateString("aaaa", "aaaa"));   // true
    }



    public static  boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // Try all possible rotation amounts
        for (int k = 0; k < s.length(); k++) {
            StringBuilder sb = new StringBuilder(s);
            // Reverse whole string
            sb.reverse();
            // Reverse first part [0..k]
            reverseRange(sb, 0, k);
            // Reverse second part [k+1..end]
            reverseRange(sb, k + 1, sb.length() - 1);

            if (sb.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }

    
    private static void reverseRange(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}