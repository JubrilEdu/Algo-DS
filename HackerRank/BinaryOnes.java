package HackerRank;

import java.util.*;

/**
 * Created by Jubril on 4/9/18.
 */
public class BinaryOnes {

    public static void main(String[] args) {
        BinaryOnes binaryOnes = new BinaryOnes();
//        int[] tester = binaryOnes.getOnes(161);
//        for (int i = 0; i < tester.length; i++) {
//            System.out.println(tester[i]);
//        }
        int[] n = {4, 6, 2, 2, 6, 6, 4};
        System.out.println(binaryOnes.solution(n));
    }

//    public int[] getOnes(int n){
//       String bit =  Integer.toBinaryString(n);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        String[] hand = bit.split("");
//        for (int i = 0; i < hand.length; i++) {
//            if (hand[i].equalsIgnoreCase("1")){
//                arrayList.add(i+1);
//            }
//        }
//        int[] result = new int[arrayList.size()+1];
//        result[0] = arrayList.size();
//        for (int i = 0; i < arrayList.size(); i++) {
//             result[i+1] = arrayList.get(i);
//        }
//
//        return  result;
//    }

    int solution(int[] A) {
        int N = A.length;
        int result = 0;
        int baseIndex = 0;

            for (int j = 0; j < N; j++) {
                if (A[0] != A[j]){
                    result = Math.max(result,j-baseIndex);
                }

            }


        return result;
    }
}
