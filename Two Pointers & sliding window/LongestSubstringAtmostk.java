import java.util.HashMap;
import java.util.Map;

public class LongestSubstringAtmostk {
    public static void main(String[] args) {
        String s = "aababbcaacc";
        int k = 2;
        System.out.print("The longest substring with Atmost k characters is : " + kDistinctChar(s, k) );
    }

    public static int kDistinctChar(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int start=0,end=0,maxlen=0;

        while(end<s.length()){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);

            while(map.size() > k){
                map.put(s.charAt(start),map.getOrDefault(s.charAt(start),0)-1);
                if(map.get(s.charAt(start)) == 0) map.remove(s.charAt(start));
                start++;
            }

            maxlen = Math.max(maxlen, (end-start)+1);
            end++;
        }
        return maxlen;
    }
}
