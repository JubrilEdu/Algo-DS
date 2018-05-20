package HackerRank;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Jubril on 3/23/18.
 */
public class BirthDayCakeCandle {
    public static void main(String[] args) {
        BirthDayCakeCandle birthDayCakeCandle = new BirthDayCakeCandle();
        int[] A = {3,2,1,3};
        System.out.println(birthDayCakeCandle.maxCandleTOBlow(A));
    }

    public int maxCandleTOBlow(int[] A){
        Arrays.sort(A);
        int max = A[A.length-1];
        int frequency = 0;
        for (int i = 0; i < A.length ; i++) {
            if (A[i] == max){
                frequency++;
            }
        }
        return  frequency;
    }
}
