/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.Scanner;

/**
 *
 * @author Jubril
 */
public class OddOccurrences {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        
        OddOccurrences occurrences = new OddOccurrences();
        System.out.println(occurrences.xorMethod(A));
    }
    
   
    public int oddValue(int[] A){
      int counter = 0;
        int value = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    counter ++;
                }
            }
            System.out.println(counter);
            if (counter>1) {
               counter = 0;
            }else{
                value = A[i];
                return A[i];
                    }
        }
        return value;
    }
    
    //better time complexity 
    public int xorMethod(int[] A){
       	int unpaired = 0;
		for (int number : A) {
			unpaired ^= number;                        
		}
		return unpaired;
    
    }
}
