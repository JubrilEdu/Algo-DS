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
public class FrogJump {
    public static void main(String[] args) {
        
    }
    
    public int minimalNumberOfJumps(int X, int Y, int D){
     double x = X; double y = Y; double d = D;   
     return (int) Math.ceil(((y - x)/d));
    }
}
