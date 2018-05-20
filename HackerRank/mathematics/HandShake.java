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
public class HandShake {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numberOfTests = scanner.nextInt();
//        for (int i = 0; i < numberOfTests; i++) {
//            int numberOfDirectors = scanner.nextInt();
//            int numberOfPossibleHandShakes = (numberOfDirectors*(numberOfDirectors-1))/2;
//        System.out.println(numberOfPossibleHandShakes);
//        }
//        
        HandShake handShake = new HandShake();
        System.out.println(handShake.rcurse(10));
    }
    
    public double rcurse(int deg){
        System.out.println(Math.sin(deg));
     return rcurse(deg-1) ;
    }
}
