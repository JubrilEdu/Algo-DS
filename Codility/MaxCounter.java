package Codility;

import java.util.Arrays;

/**
 * Created by Jubril on 5/20/18.
 */
public class MaxCounter {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter();
        int[] A = { 3,4,4,6,1,4,4};
        int[] B = maxCounter.solution(5,A);
        for (int value:B) {
            System.out.print(value);
        }
    }
    public int[] solution(int N, int[] A){
        int[] counterStorage = new int[N];
        int maxValue = 0;
        int resetValue = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] > N) {
                resetValue = maxValue;
            }else{
                if (counterStorage[A[i]-1]>= resetValue){
                    counterStorage[A[i]-1] += 1;
                }else {
                    counterStorage[A[i]-1] = resetValue+1;
                }
                if (counterStorage[A[i]-1] > maxValue){
                    maxValue = counterStorage[A[i]-1];
                }
            }
        }
        for (int i = 0; i < counterStorage.length ; i++) {
            if (counterStorage[i] < resetValue){
                counterStorage[i] = resetValue;
            }
        }
        return  counterStorage;
     }
}
