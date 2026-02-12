//leetcode problem 319

public class BulbSwitcher {
    public static void main(String[] args) {
        int bulb = 8;

        System.out.println("The number of on bulbs are : " +  bulbSwitch(bulb));
    }

    static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
