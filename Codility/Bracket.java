package Codility;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Jubril on 3/23/18.
 */
public class Bracket {
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        System.out.println(bracket.isMatch("{[()()]}"));
    }

    public int isMatch(String S){
        if (S.isEmpty()){
            return 1;
        }
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('}','{');
        hashMap.put(']','[');
        hashMap.put(')','(');
        for (int i = 0; i < S.length() ; i++) {
            char c = S.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }

            if (c == '}' || c == ']' || c == ')'){
                if (stack.isEmpty()){
                    return 0;
                }else {
                    if (stack.peek().equals(hashMap.get(c))){
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
