package LeetCode;

/**
 * Created by JB on 10/18/18.
 */
public class SearchRotatedArray {
    public int search(int[] nums, int target) {
           int low = 0; int high = nums.length -1;
            while (low <= high) {
                int midPoint = (low+high)/2;
                if (nums[midPoint] == target) {return midPoint;}
                if (nums[midPoint] <= nums[high]){
                    if (target > nums[midPoint] && target <= nums[high] ) {
                        low = midPoint+1;
                    } else {
                        high = midPoint-1;
                    }
                } else {
                    if ( target >= nums[low] &&  target < nums[midPoint] ) {
                        high = midPoint-1;} else{
                        low = midPoint+1;}
                    }
                }
            return -1;
    }
}
