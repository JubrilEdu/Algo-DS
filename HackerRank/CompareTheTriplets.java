package HackerRank;

import java.util.Scanner;

/**
 * Created by Jubril on 3/7/18.
 */
public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] result = new int[2];
        int[] alice = {a0,a1,a2};
        int[] bob = {b0,b1,b2};
        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob [i]){
                result[0]++;
            }else if (alice[i]<bob[i]){
                result[1]++;
            }
        }
        return  result;
    }
}
