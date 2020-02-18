package LeetCode;

import java.util.ArrayList;

/**
 * Created by JB on 4/28/19.
 */
public class DominantIndex {
    public static void main(String[] args) {
        DominantIndex dominantIndex = new DominantIndex();
        System.out.println(dominantIndex.dominantIndex(new int[]{0,0,3,2}));
    }
    public int dominantIndex(int[] nums) {
        int max = 0;
        int min = 0;
        int index = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > max){
                min = max;
                max = nums[i];
                index = i;
            }

            if (nums[i] > min && nums[i] < max){
                min = nums[i];
            }
        }
        if (max >= min*2){
            return index;
        } else {
            return -1;
        }

    }
}
