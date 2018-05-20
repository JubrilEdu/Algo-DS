/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jubril
 */
public class EulerCriterion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int t=0; t<T; t++) {
            int A = input.nextInt();
            int P = input.nextInt();
            if (P == 2 || A == 0) {
                System.out.println("YES");
            } else {
                int value = BigInteger.valueOf(A).modPow(BigInteger.valueOf((P-1)/2), BigInteger.valueOf(P)).intValue();
                System.out.println((value == 1) ? "YES" : "NO");
            }
        }
    }
    
    
}
