package HackerRank;

/**
 * Created by Jubril on 5/14/18.
 */
public class ArrayRotation {
    public static void main(String[] args) {

    }

    public int[] rotate(int[] input, int numberOfShifts){
        int[] shiftedArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int newPosition = (i+numberOfShifts)%input.length;
            shiftedArray[newPosition] = input[i];
        }

        for (int content: shiftedArray){
            System.out.print(content+" ");
        }

        return shiftedArray;
    }
}
