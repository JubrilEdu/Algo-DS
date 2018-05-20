package HackerRank;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Jubril on 5/13/18.
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JavaStack javaStack = new JavaStack();
        System.out.println(javaStack.isValidParenthesis(scanner.next()));
    }

    public boolean isValidParenthesis(String input){
        HashMap<Character,Character> hashMap = new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('{','}');
        hashMap.put('[',']');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length() ; i++) {
            char currentCharacter = input.charAt(i);
            if (hashMap.containsKey(currentCharacter)){
                stack.push(currentCharacter);
            }else{
                if (!stack.isEmpty() && currentCharacter == hashMap.get(stack.peek())){
                    stack.pop();
                }else {
                    return  false;
                }
            }
        }
        return  stack.isEmpty();
    }
}
