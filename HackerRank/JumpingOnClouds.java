package HackerRank;

/**
 * Created by JB on 4/1/19.
 */
public class JumpingOnClouds {

    public static void main(String[] args) {

    }

    public int jumpingOnClouds9(int[] c) {
        int stepCount = 0;
        int stepIncrement = 0;
        while (stepIncrement < c.length - 1) {
                    if ((stepIncrement + 2) >= c.length || c[stepIncrement + 2] == 1) {
                        if (c[stepIncrement + 1] == 0) {
                            stepCount++;
                            stepIncrement = stepIncrement +1;
                        }
                    } else if (c[stepIncrement + 2] == 0) {
                        stepCount++;
                        stepIncrement = stepIncrement + 2;
                    }
                }
        return  stepCount;
    }
}
