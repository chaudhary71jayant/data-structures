//Reverse an Integer using the outside integer

public class ReverseIntegerI {
    public static void main(String[] args) {
        revI(1826);
        System.out.println(sum);
    }

    static int sum = 0;

    static void  revI(int n){
        if(n==0) return;

        int rem = n%10;
        sum = sum *10+rem;
        revI(n/10);
    }
}
