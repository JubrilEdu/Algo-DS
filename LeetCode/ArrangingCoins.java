package LeetCode;

/**
 * Created by JB on 9/19/18.
 *
 */
public class ArrangingCoins {
    public static void main(String[] args) {
        ArrangingCoins arrangingCoins = new ArrangingCoins();
        System.out.println(arrangingCoins.arrangedCoins(1804289383));
    }

    public int arrangedCoins(int n) {
        return (int)(Math.sqrt(8l*n+1)-1)/2;

    }


    public long calculateSum(Integer i) {
        Long val = Long.valueOf(i);
        return (val*val+val)/2;
    }
}
