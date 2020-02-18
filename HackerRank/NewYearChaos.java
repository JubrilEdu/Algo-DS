package HackerRank;

import java.util.Scanner;

/**
 * Created by JB on 2/21/19.
 */
public class NewYearChaos {

    static void minimumBribes(int[] q) {

        int swaps=0;
        boolean isChaotic = false;
        for(int i=0;i< q.length;i++){
            if ((q[i]-(i+1)) > 2) {
                isChaotic = true;
                break;
            }
            for(int j=Math.max(0, q[i]-2);j<i;j++){

                if(q[j] > q[i]){
                    swaps++;
                }
            }
        }
        if (!isChaotic){
            System.out.println(swaps);
        } else {
            System.out.println("Too chaotic");

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
