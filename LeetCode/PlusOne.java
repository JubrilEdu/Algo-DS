package LeetCode;

import java.util.ArrayList;

/**
 * Created by JB on 4/28/19.
 */
public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        for (int va: plusOne.plusOne(new int[]{1,2,3})) {
            System.out.println(va);
        }
    }
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i>= 0; i--) {
            digits[i] += carry;
            if (digits[i] <= 9) // early return
                return digits;
            digits[i] = 0;
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}
