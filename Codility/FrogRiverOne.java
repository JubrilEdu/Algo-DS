/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbeginning;

import java.util.HashSet;

/**
 *
 * @author Jubril
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        FrogRiverOne fro = new FrogRiverOne();
        int[] A = {1,3,1,4,2,3,5,4};
        fro.frogRiver(5,A);
    }
    
    public int frogRiver(int X, int[] A){
         HashSet<Integer> hashMap = new HashSet<>();
         for (int i = 0; i < A.length; i++) {
            hashMap.add(A[i]);   
            if (hashMap.size()==X) {
                return i;}
        }
        return -1;
    }
}
