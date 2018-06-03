package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Jubril on 6/3/18.
 */
public class MedianOfArray {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};
        MedianOfArray medianOfArray = new MedianOfArray();
        medianOfArray.findMedianSortedArrays(A,B);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,result,0,nums1.length);
        System.arraycopy(nums2,0,result,nums1.length,nums2.length);
        Arrays.sort(result);
        if (result.length%2 == 0) {
            int midpoint = result.length / 2;
            System.out.println("midpoint"+ midpoint);
            System.out.println(Double.valueOf(result[midpoint-1]) );
            System.out.println(Double.valueOf(result[midpoint]) );
            System.out.println((Double.valueOf(result[midpoint-1]) + Double.valueOf(result[midpoint])) / 2);
            return (result[midpoint] + result[midpoint / 2]) / 2;
        } else {
            Double midpoint = Double.valueOf(result.length/2);
            return result[(int) Math.ceil(midpoint)];
        }
    }
}
