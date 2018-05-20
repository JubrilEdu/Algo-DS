package Codility;

/**
 * Created by Jubril on 3/7/18.
 */
public class PassingCars {

    public static void main(String[] args) {
        PassingCars passingCars = new PassingCars();
        int[] caser = {0,1,0,1,1};
        System.out.println(passingCars.solution(caser,5));
    }
    public int solution(int[]A,int N){
        int numberOfZeros = 0;
        int numberOfOnes = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0){
                sum = sum + (numberOfOnes*numberOfZeros);
                if (Math.abs(sum)>1000000000){
                    return -1;
                }
                numberOfZeros++;
                numberOfOnes = 0;
            }else{
                if (i == A.length-1){
                    numberOfOnes++;
                    sum = sum + (numberOfOnes*numberOfZeros);
                    if (Math.abs(sum) >1000000000){
                        return -1;
                    }
                }else {
                    numberOfOnes++;
                }


            }
        }

        return sum;
    }
}
