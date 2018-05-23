package HackerRank.mathematics;

import java.util.Scanner;

/**
 * Created by Jubril on 5/21/18.
 */
public class LowestTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }

    public  static  int lowestTriangle(int base, int area){
        return (int) Math.ceil(((2*Double.valueOf(area))/Double.valueOf(base)));
    }
}
