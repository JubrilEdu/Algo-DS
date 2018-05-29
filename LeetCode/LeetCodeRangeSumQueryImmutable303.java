package LeetCode;

import java.util.Stack;

/**
 * Created by Jubril on 6/19/16.
 */
public class LeetCodeRangeSumQueryImmutable303 {
    int[] nums;
    public LeetCodeRangeSumQueryImmutable303(int[] nums){
        this.nums = nums;
    }
    public static void main (String[] args){
        int[] pseudo = {-2, 0, 3, -5, 2, -1};
        LeetCodeRangeSumQueryImmutable303 leetCodeRangeSumQueryImmutable303 = new LeetCodeRangeSumQueryImmutable303(pseudo);
        System.out.println(leetCodeRangeSumQueryImmutable303.sumRange(0,5));
    }

    public int sumRange(int i,int j){
        int sum =0;
        for (int k = i; k <= j ; k++) {
            sum = sum+nums[k];
        }
        return sum;
    }
}

