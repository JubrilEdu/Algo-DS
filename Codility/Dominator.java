package Codility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Jubril on 5/21/18.
 */
public class Dominator {
    public static void main(String[] args) {
        Dominator dominator = new Dominator();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(dominator.solution(A));
    }

    public int solution(int[] A){
        Stack stack = new Stack();
        int index = 0;
        int counter = 0;
        for (int i = 0; i < A.length; ++i) {
            if(stack.size() == 0) {
                stack.push(A[i]);
                index = i;
            } else {
                if((int)stack.peek() != A[i]) {
                    stack.pop();
                } else {
                    stack.push(A[i]);
                }
            }
        }
        if (stack.size() == 0) return -1;
        for (int value:A) {
            if (value == (int)stack.peek()){
                counter++;
            }
        }

        return counter > A.length/2? index:-1;
    }

}
