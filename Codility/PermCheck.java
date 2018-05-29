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
public class PermCheck {
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        int[] A = {1,2,3,4};
        permCheck.permCheck(A);
    }
    
    public int permCheck(int[] A){
        int checker = 0;
        for (int i = 0; i < A.length; i++) {
            checker = A[i]^(i+1);
           
        }
        System.out.println(checker);
        if (checker == 0) {
            return 0;
        }else{
            return 1;
        }
        
    }
}
