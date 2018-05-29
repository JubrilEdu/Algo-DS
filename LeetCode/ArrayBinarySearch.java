package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Jubril on 6/3/16.
 */
public class ArrayBinarySearch {

    public static void main (String[]args){
        ArrayBinarySearch arrayBinarySearch = new ArrayBinarySearch();
        int [] sampleArray = {1,3,4,5,6,7,8,9,32,34,45,66,74,84};
        System.out.println(arrayBinarySearch.search(sampleArray,6));
        System.out.println(Arrays.binarySearch(sampleArray,6));
        System.out.println(arrayBinarySearch.defaultsearch(sampleArray,6));
    }
    /**
     *
     * @param numbers
     * @param searchdigit
     * @return
     */
    public int search(int[] numbers,int searchdigit){
        int upperBound = numbers.length;
        int lowerBound = 0;
        while (lowerBound<upperBound){
            int midPoint = (lowerBound + upperBound)/2;
            if (numbers[midPoint]==searchdigit){
                return midPoint;
            }else if (numbers[midPoint]<searchdigit){
                lowerBound = midPoint +1;
            }else {
                upperBound = midPoint;
            }
        }
        return -1;
    }

    public int defaultsearch(int[] numbers,int searchDigit){
        for (int i =0;i<=numbers.length;i++){
            if (numbers[i]== searchDigit){
                return i;
            }
        }
        return -1;
    }
}
