package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Boolean containsWords = true;
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < magazine.length ; i++) {
            if (hashMap.containsKey(magazine[i])){
                int initialValue = hashMap.get(magazine[i]);
                hashMap.put(magazine[i],(initialValue+1));
            } else {
                hashMap.put(magazine[i],1);
            }
        }

        for (int i = 0; i < note.length; i++) {
            if (hashMap.containsKey(note[i])){
                if (hashMap.get(note[i]) <= 0){
                    containsWords = false;
                } else {
                    int initialValue = hashMap.get(note[i]);
                    hashMap.put(note[i],(initialValue - 1));
                }
            } else {
                containsWords = false;
            }
        }

        if (containsWords){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
