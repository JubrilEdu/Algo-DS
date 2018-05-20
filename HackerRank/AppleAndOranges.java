package HackerRank;

/**
 * Created by Jubril on 3/24/18.
 */
public class AppleAndOranges {
    public static void main(String[] args) {
        AppleAndOranges appleAndOranges = new AppleAndOranges();
        int[] A = {-2,2,1};
        int[] B = {5 ,-6};
        appleAndOranges.result(7,11,5,15,A,B);
    }

    public void result(int s, int t, int a, int b, int[] apples, int[] oranges){
      // s and t = region used for scoring
        // a and b larry and Bob's position
        int larryScore = 0, bobScore = 0;
        for (int i = 0; i < apples.length; i++) {
              int value =   ( a + apples[i]);
                        if (value>=s && value<=t){
                            larryScore++;
                        }
        }

        for (int i = 0; i < oranges.length; i++) {
            int value =   ( b + oranges[i]);
            if (value >= s && value<=t){
                bobScore++;
            }
        }

        System.out.println(larryScore);
        System.out.println(bobScore);
    }
}
