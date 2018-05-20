package Codility;

/**
 * Created by Jubril on 3/8/18.
 */
public class MinAvgTwoSlice {
    public static void main(String[] args){
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        int[] A = {4,2,2,5,1,5,8};
        System.out.println(minAvgTwoSlice.solution(A));
    }

    public int solution(int[] A){
        int avg = Integer.MAX_VALUE; int val = 0;int sum = 0;
        for (int i = 1; i < A.length; i++) {
            for (int j = i+1; j<=A.length;j++){
                for (int k = i;k<j;k++){
                    sum =+ A[k];
                }
                int localavg = sum/(j-i+1);
                if (localavg<avg){
                    avg = localavg;
                    val = i;
                }
            }
        }

        return val;
    }
}
