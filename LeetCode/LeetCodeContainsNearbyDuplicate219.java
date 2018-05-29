package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jubril on 6/19/16.
 */
public class LeetCodeContainsNearbyDuplicate219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //use hashmap,implement using value as key or hashset
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
