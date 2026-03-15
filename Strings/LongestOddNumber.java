//Leetcode 1903

public class LongestOddNumber{
    public static void main(String[] args) {
        String num = "52";

        String ans = largestOddNumber(num);

        System.out.print("The largest valued odd number in the string is : " + ans);
    }

    public static  String largestOddNumber(String num) {
        int i= num.length()-1;
        while(i>=0){
            if(num.charAt(i) % 2 !=0){
                return num.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
}