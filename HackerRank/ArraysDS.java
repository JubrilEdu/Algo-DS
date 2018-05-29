package HackerRank;

import java.util.Scanner;

/**
 * Created by Jubril on 5/29/18.
 */
public class ArraysDS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();
        int[] inputs = new int[iteration];
        for (int i = 0; i < iteration; i++) {
            inputs[i] = scanner.nextInt();
        }
        ArraysDS arraysDS = new ArraysDS();
        arraysDS.reverse(inputs);
    }

    public int[] reverse(int[] a){
        int temp=0;
        for (int i = 0; i < a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }

        return a;
    }


}
