package HackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by JB on 9/23/18.
 */
public class JavaSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> hashSet = new HashSet<>();
        for (int j =0; j< t; j++){
            hashSet.add(pair_left[j]+"+"+pair_right[j]);
            System.out.println(hashSet.size());
        }
    }
}
