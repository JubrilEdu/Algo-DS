/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematics;

import java.util.Scanner;

/**
 *
 * @author Jubril
 */
public class FindPoint {
    static int pOne,pTwo,pThree,pFour; 
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        for (int i = 0; i < numberOfInput; i++) {
             pOne =scanner.nextInt();
             pTwo = scanner.nextInt();
             pThree = scanner.nextInt();
             pFour = scanner.nextInt();
            int distance1 = (pThree-pOne+pThree);
            int distance2 = (pFour-pTwo+pFour);
           System.out.println(distance1+" "+distance2);
        }
           
    }
}
