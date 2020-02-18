package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));

    }


    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)return "";
        if (strs.length == 1) return strs[0];
        StringBuilder stringBuilder = new StringBuilder();
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            char currentItem = strs[0].charAt(i);
            for (String item : strs) {
                if (i >= item.length()) return stringBuilder.toString();
                if (item.charAt(i) != currentItem) return stringBuilder.toString();
            }
            stringBuilder.append(currentItem);
        }
      return stringBuilder.toString();
    }
}
