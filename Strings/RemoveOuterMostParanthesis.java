//Leetocode 1021

public class RemoveOuterMostParanthesis {
    public static String answer(String s){
        StringBuilder ans = new StringBuilder();

        int level =0;

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                level--;
                if(level>0){
                    ans.append(ch);
                }
            } else if(ch == '('){
                if(level>0) ans.append(ch);
                level++;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String s = "(((())))";
        System.out.println("After removing outermost paranthesis." + answer(s));
    }
}
