/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbeginning;

/**
 *
 * @author Jubril
 */
public class TapeEquilibrium {
    
    public static void main(String[] args) {
        
    }
    
    private int getLowestDifferenceValue(int[]A){
        int leftSum = 0; int rightSum=0; int answer=Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            rightSum += A[i];
        }
        for (int i = 0; i < A.length-1; i++) {
            leftSum+=A[i];
            rightSum -= A[i];
            int calc = Math.abs(rightSum-leftSum);
            if (answer>calc){
               answer = calc;
            }
        }
        
        return answer;
    }
}
