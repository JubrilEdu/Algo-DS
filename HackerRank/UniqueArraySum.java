package HackerRank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UniqueArraySum {

    public static void main(String[] args) {

    }

    public static int getMinimumUniqueSum(List<Integer> arr) {
        // Write your code here
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            if (hashSet.contains(arr.get(i))){
                int val = arr.get(i);
                while (hashSet.contains(val)){
                    val = val+1;
                }
                hashSet.add(val);
            } else {
                hashSet.add(arr.get(i));
            }

        }

        int sum = 0;
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            sum = sum + iterator.next();
        }

        return  sum;

    }


}
