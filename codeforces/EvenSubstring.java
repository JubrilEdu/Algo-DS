package codeforces;


import java.util.Scanner;

public class EvenSubstring {

    public static void main(String[] args) {
        EvenSubstring evenSubstring = new EvenSubstring();
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();
        String newString = scanner.next();
        System.out.println(evenSubstring.evenSubStringCounter(newString));
    }

    public int evenSubStringCounter(String input) {
        int counter = 0;
        char[] container = input.toCharArray();
        for (int i = 0; i < container.length ; i++) {
            if ((container[i] - '0')%2 == 0) {
                counter += i+1;
            }
        }
        return counter;
    }
}
