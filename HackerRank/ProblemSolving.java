package HackerRank;

import java.util.LinkedList;

/**
 * Created by JB on 9/29/18.
 */
public class ProblemSolving {
    public static void main(String[] args) {

    }

    static int problemSolving(int k, int[] v) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int daysCounter = 0;
        for (int value: v) {
            linkedList.add(value);
        }
        while (linkedList.size()>0){
            for (int i = 0; i < linkedList.size(); i++) {
                if (Math.abs(linkedList.get(i) - linkedList.get(i+1)) >= k ){
                     linkedList.remove(i);
                } else {

                }
            }
            daysCounter++;
        }
        return  daysCounter;
    }
}
