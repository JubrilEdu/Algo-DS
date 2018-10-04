package HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by JB on 10/5/18.
 */
public class JavaDeque  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hashSet.add(num);
            if (deque.size() == m) {
                if (hashSet.size() > max) max = hashSet.size();
                int remove = (int) deque.remove();
                if (!deque.contains(remove)){
                    hashSet.remove(remove);
                }
            }
        }

        System.out.println(max);
    }
}
