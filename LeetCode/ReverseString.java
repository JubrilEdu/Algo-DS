package LeetCode;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[]{'H','a','n','n','a','h'});
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2 ; i++) {
            char temp = s[i];
            s[i] = s[(s.length-1) - i];
            s[(s.length -1)-i] = temp;
        }

    }

}
