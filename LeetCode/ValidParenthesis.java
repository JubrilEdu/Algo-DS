package LeetCode;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Jubril on 6/9/16.
 */
public class ValidParenthesis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid(word));
    }

    public boolean isValid(String s) {
        String baseLeftLetters = "([{";
        String baseRightLetters = ")]}";
        Stack<Character> indexStack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (baseLeftLetters.contains(s.substring(i, i + 1))) {
                indexStack.push(baseRightLetters.charAt(baseLeftLetters.indexOf(s.substring(i, i + 1))));
            } else if (indexStack.isEmpty()) {
                return false;
            } else {
                char poppedIndex = indexStack.pop();
                if (poppedIndex != s.charAt(i)) {
                    return false;
                }
            }
        }
        if (!indexStack.empty())
            return false;

        return true;
    }
}
