package HackerRank;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by JB on 4/6/19.
 */
public class ForegoneSolution {

    public static void main(String[] args) {
        ForegoneSolution foregoneSolution = new ForegoneSolution();
        Scanner scanner = new Scanner(System.in);
        int iterator = scanner.nextInt();
        for (int i = 0; i < iterator ; i++) {
            foregoneSolution.noFOur(scanner.nextInt(),i);
        }

    }

    public void noFOur(int val,int trial) {
        String test = "";
            if (String.valueOf(val).contains("4")) {
                test = String.valueOf(val).replace("4","3");
            }
        if (!test.isEmpty()) {
            System.out.println("Case #" + trial + ": " + (Integer.valueOf(test)) + " " + (val - Integer.valueOf(test)));
        }

    }

}
