package HackerRank;

/**
 * Created by JB on 9/28/18.
 */
public class SaveThePrisoner {
    public static void main(String[] args) {

    }

    static int saveThePrisoner(int numberOfPrisoners, int numberOfSweets, int startingPoint) {
        int value = (startingPoint+numberOfSweets-1)%numberOfPrisoners;
        return value == 0 ? numberOfPrisoners: value;
    }
}
