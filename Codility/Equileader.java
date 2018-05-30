package Codility;

import java.util.Stack;

/**
 * Created by Jubril on 5/30/18.
 */
public class Equileader {
    
    public static void main(String[] args) {
        Equileader equileader = new Equileader();
        int[] A = {4,3,4,4,4,2};
        System.out.println(equileader.solution(A));
    }

    public int solution(int[] A){
        Stack stack = new Stack();
        int index = 0;
        int counter = 0;
        int otherLeaders = 0;
        int equileaderCandidate = 0;
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
        if (stack.size() == 0) return 0;
        for (int value:A) {
            if (value == (int)stack.peek()){
                counter++;
            }
        }
        if (counter > A.length/2){
            for (int j =0; j< A.length ; j++) {
                if (A[j] == (int)stack.peek()){
                    equileaderCandidate++;
                }
                if((equileaderCandidate > (j+1)/2)
                        && ((counter-equileaderCandidate) > (A.length-j-1)/2)) {
                    otherLeaders++;
                }
            }

        }

        return otherLeaders;
    }
}
