import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number of fibonacci series you want to print : ");
        int n = sc.nextInt();

        System.out.println("The fibonacci number is : " + fibo(n));

        sc.close();
    }

    static int fibo(int n){
        if(n<2) return n;// this is the base condition.

        return fibo(n-1) + fibo(n-2);
    }
}