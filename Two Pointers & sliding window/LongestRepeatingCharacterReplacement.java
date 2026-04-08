//Leetcode 424 longest repeating character replacement.
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        System.out.println("The longest string we can get is : " + characterReplacement(s, k));
    }

    static int characterReplacement(String s, int k){
        HashMap<Character,Integer> map = new HashMap<>();

        int start=0,end=0,maxlen=0,maxFreq=0;

        while(end<=s.length()-1){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);

            maxFreq = Math.max(maxFreq,map.get(s.charAt(end)));

            while((end-start+1) - maxFreq > k){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            maxlen = Math.max(maxlen, end-start+1);
            end++;
        }
        return maxlen;
    }
}
