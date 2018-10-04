package HackerRank;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by JB on 9/19/18.
 */
public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIteration = scanner.nextInt();
        int[] valueContainer = new int[numberOfIteration];
        for (int i = 0; i < numberOfIteration; i++) {
            valueContainer[i] = scanner.nextInt();
        }
        SubArray subArray = new SubArray();
        System.out.println(valueContainer);
    }

    public int getNegativeSubArrays(int[] value){
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < value.length; i++) {
            sum = 0;
            for (int j = i; j < value.length ; j++) {
                sum += value[j];
                if (sum < 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}
