package HackerRank;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Scanner;

/**
 * Created by JB on 3/24/19.
 */
public class CountingValleys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nexttt = scanner.nextInt();
        String start = "";
        for (int i = 0; i < nexttt ; i++) {
            start = start.concat(scanner.next());
        }
        System.out.println(start);
        CountingValleys.countingValleys(start.length(),start);
    }

    static int countingValleys(int n, String s) {
        int movement = 0;
        int valleyCounter = 0;
        for (int i = 0; i < n ; i++) {
            char ch = s.charAt(i);
            if (ch == 'U') {
                movement+=1;
                if (movement == 0) {
                    valleyCounter+=1;
                }
            } else  {
                movement-=1;
            }


        }
        System.out.println(valleyCounter);
        return valleyCounter;

    }
}
