/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Jubril
 */
public class PalindromicNumber {
    public static void main(String[] args) {
        PalindromicNumber palindromicNumber = new PalindromicNumber();
        System.out.println(palindromicNumber.isNumberPalindrome(121));
    }
    
   public boolean isNumberPalindrome(int x){
       if (x<0) {
           return false;
       }
      int temporaryValue = x;
      int reverseValue = 0;
      while (x!=0){
        reverseValue = reverseValue*10 + x%10;
        x = x/10;
      }
      if(reverseValue == temporaryValue){
          return true;
      }else{
      return false;
      }
   }
}