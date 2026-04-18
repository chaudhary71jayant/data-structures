public class ReverseIntegerII {
    public static void main(String[] args) {
        int n = 1684;
        System.out.println("The reverse of the integer is : " + revII(n));
    }

    static int revII(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }

    static int helper(int n,int digit){
        if(n%10 == 0) return n;

        int rem = n%10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
}
