/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

/**
 *
 * @author Jubril
 */
public class CyclicRotation {
    public static void main(String[] args) {
        
    }
    
    public int[] shiftArrayContent(int[]arrayToShift,int numberOfShifts){
        int[] shiftedArray = new int[arrayToShift.length];
        for (int i = 0; i < arrayToShift.length; i++) {
            int newPosition = (i+numberOfShifts)%arrayToShift.length;
            shiftedArray[newPosition] = arrayToShift[i];
        }
        
        return shiftedArray;
    }
}
