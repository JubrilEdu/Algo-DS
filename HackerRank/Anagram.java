package HackerRank;


import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }


    static int makeAnagram(String a, String b) {
        int[] letters = new int[26];
        a.chars().forEach(c -> letters[c-'a']++);
        b.chars().forEach(c -> letters[c-'a']--);
        return Arrays.stream(letters).map(Math::abs).sum();
    }
}