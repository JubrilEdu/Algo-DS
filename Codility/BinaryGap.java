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
public class BinaryGap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(BinaryGap.longestZero(value));
    }
    
    public static int longestZero(int value){
        int zerocounter = 0;
        int longestNumberofZero = 0;
        String valueConverted = Integer.toBinaryString(value);
        for (int i = 0; i < valueConverted.length(); i++) {
             if(valueConverted.charAt(i)== '1'){
                 if (zerocounter >= longestNumberofZero) {
                     longestNumberofZero = zerocounter;
                 }
                 zerocounter = 0;
             }else{
                 zerocounter++;
             }
        }
        return longestNumberofZero;
    }
    
}
