/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopeshit;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Jubril
 */
public class problem274_hIndex {

    public static void main(String[] args) {

    }

     public int hIndex(int[] citations) {
         Arrays.sort(citations);
         for(int i =0; i < citations.length/2; i++){
                int temp = citations[i];
                citations[i] = citations[citations.length-1 - i];
                citations[citations.length-1 - i] = temp;
            }
        int val =0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i]< (i+1)) {
                val = i;
                break;
            }else{
              val = i+1;
            }
        }
        return val;
    }

}
