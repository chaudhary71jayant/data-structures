public class OddEven {
    public static void main(String[] args) {
        int n=23;
        if(isEven(n)){
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }

    public static boolean isEven(int n){
        return (n & 1) == 0;
    }
}