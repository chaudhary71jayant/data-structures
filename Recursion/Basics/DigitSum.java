public class DigitSum {
    public static void main(String[] args) {
        int n  = 9;
        System.out.println("The digit sum of the number is : " + sum(n));
    }

    static int sum(int n){
        if(n < 10) return n;

        return sum(n/10) + sum(n%10);
    }
}
