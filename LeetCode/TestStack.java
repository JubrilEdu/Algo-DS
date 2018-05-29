package LeetCode;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Jubril on 6/17/16.
 */
public class TestStack {
    public static void main(String[] args) {
        TestStack testStack = new TestStack();
        System.out.println(testStack.sumUp());
    }

    public int sumUp() {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for (int i = 1; i <= Integer.parseInt(input); i++) {
            String value = scanner.next();
            if (value.equals("+")) {
                if (stack.capacity() > 2) {
                    stack.push(String.valueOf(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
                    System.out.println(stack.capacity());
                } else {
                    return Integer.parseInt(stack.pop());
                }
            } else {
                stack.push(value);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
