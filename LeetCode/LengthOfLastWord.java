package LeetCode;

/**
 * Created by JB on 1/13/19.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
    }
    public int lengthOfLastWord(String s) {
        if (s.split(" ").length > 1) {
            return s.split(" ")[s.split(" ").length -1 ].length();
        }
        return 0;
    }
}
