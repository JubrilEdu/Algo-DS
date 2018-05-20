package HackerRank;

/**
 * Created by Jubril on 4/15/18.
 */
public class CatAndMouse {
    public static void main(String[] args) {

    }

    public String catAndMouse(int x, int y, int z) {
        int distanceCatA = Math.abs(z-x);
        int distanceCatB = Math.abs(z-y);

        if (distanceCatA < distanceCatB){
            return "Cat A";
        } else if (distanceCatB < distanceCatA){
            return "Cat B";
        }else {
            return "Mouse C";
        }

    }
}
