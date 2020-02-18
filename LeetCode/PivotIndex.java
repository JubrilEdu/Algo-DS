package LeetCode;


/**
 * Created by JB on 4/27/19.
 */
public class PivotIndex {

    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();
        System.out.println(pivotIndex.pivotIndex(new int[]{-1,-1,-1,-1,-1,-1}));
    }
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int forwardSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }

        for (int i = 0; i < nums.length ; i++) {
            forwardSum = i == 0 ? 0: forwardSum+nums[i-1];
            sum -= nums[i];
            if (forwardSum == sum){
                return i;
            }

        }

        return -1;
    }
}
