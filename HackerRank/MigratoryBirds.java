package HackerRank;

import java.util.HashMap;

/**
 * Created by Jubril on 4/10/18.
 */
public class MigratoryBirds {
    public static void main(String[] args) {
        MigratoryBirds migratoryBirds = new MigratoryBirds();
        int[] A = {1,4,4,4,5,3};
        System.out.println(migratoryBirds.getMax(6,A));
    }

    public int getMax(int n , int[] ar){
        int maxBird = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (hashMap.containsKey(ar[i])) {
                int num = hashMap.get(ar[i]);
                hashMap.put(ar[i],num++);

            }else{
                hashMap.put(ar[i],1);
            }
        }

        System.out.println(hashMap.size());

        for (int i = 0; i < 6 ; i++) {
            if (hashMap.containsKey(i)){
                if (hashMap.get(i) > maxBird){
                    maxBird = hashMap.get(i);
                }

            }
        }

        return maxBird;
    }


    public String occur (String word) {
        String[] container = word.split(" ");
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < container.length; i++) {
            if (hashMap.containsKey(container[i])){
                return container[i];
            }else {
                hashMap.put(container[i],1);
            }

        }
        return  "";
    }
}
