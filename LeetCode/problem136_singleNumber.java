/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopeshit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Jubril
 */
public class problem136_singleNumber {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap();
        int answer=0;
           for(int i = 0; i<nums.length; i++){
            if (hashMap.containsKey(nums[i])) {
                int value = (int) hashMap.get(nums[i]);
                hashMap.remove(nums[i]);
                hashMap.put(nums[i], value+1);
            }else{
                hashMap.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            if (e.getValue()==1) {
               answer =  e.getKey();
            }
    
            }
            return answer;
    }
    


    }
    

