//Leetcode 231
public class PowerOfTwo {
    static boolean isPower(int n){
        if(n>0){
            return (n&(n-1))==0;
        }
        return false;
    }
    public static void main(String[] args){
        int n=16;
        if(isPower(n)){
            System.out.println("The number is a power of two.");
        } else {
            System.out.println("The number is not a power of two.");
        }
    }
}
