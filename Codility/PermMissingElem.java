/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbeginning;

import java.util.Scanner;

/**
 *
 * @author Jubril
 */
public class PermMissingElem {
    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        System.out.println(Math.multiplyExact(5, (5+1))/2);
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();
        int[] A = new int[iteration];
        for (int i = 1; i < iteration; i++) {
              A[i] = scanner.nextInt();
        }
        System.out.println(permMissingElem.getMissingElement(A));
    }
    
    public int getMissingElement(int[] A){
        long size = A.length;
        long sumOfValuesInArray = (size+1)*(size+2)/2;
        for (int i = 0; i <size; i++) {
            sumOfValuesInArray -= A[i];
        }
        
        return (int)sumOfValuesInArray;
    }
}
