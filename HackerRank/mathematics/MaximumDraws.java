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
public class MaximumDraws {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTrials = scanner.nextInt();
        for(int i =0;i<numberOfTrials;i++){
            System.out.println(scanner.nextInt()+1);
        }
        
    }
}
