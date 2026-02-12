// leetcode problem no 268

public class NimGame {
   public static void main(String[] args) {
        int n = 4;

    if(canWinNim(n)){
        System.out.print("You can win the game.");
    } else {
        System.out.print("You can't win the game.");
    }
   }

    static boolean canWinNim(int n) {
        if(n%4==0) return false;
        return true;
    }
    
}
