//Leetcode 1614
public class MaximumDepth {
    public static int maxDepth(String s) {
        int count =0,maxCount=0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            } else if(ch == ')'){
                count--;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println("The max depth of paranthesis is : " + maxDepth(s));
    }
}
