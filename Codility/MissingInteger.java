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
public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        int[] A = {-1,-3};
//        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(missingInteger.missingInteger(A));
    }
    
    public int missingInteger(int[] A){
        int check  = 1;
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                hashSet.add(A[i]);
            }
        }
        
        while (check <= hashSet.size()) {            
            if (!hashSet.contains(check)) {
                return check;
            }
            check+=1;
        }
            return check;
           }
}
