//Leetcode 205
import java.util.HashMap;

public class Isomirphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();

        for(int i=0;i<s.length();i++){
           

            if(mapS.containsKey(s.charAt(i))){
                if(mapS.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            } else {
                mapS.put(s.charAt(i),t.charAt(i));
            }

            if(mapT.containsKey(t.charAt(i))){
                if(mapT.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            } else {
                mapT.put(t.charAt(i),s.charAt(i));
            }     
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        if(isIsomorphic(s, t)){
            System.out.println("The Strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }
    }
}
