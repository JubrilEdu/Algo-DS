package Codility;

/**
 * Created by Jubril on 3/7/18.
 */
public class CountDiv {
    public static void main(String[] args){
        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(10,10,20));
    }

    public int solution(int A, int B, int K){
        int divisible = 0;
        System.out.println(Math.ceil((double) B/K));
        System.out.println(Math.ceil((double) A/K));
        int firstMultiple = 0;
        int secondMultiple = 0;
        if (A%K != 0){
            firstMultiple = A + A%K;
        }else{
            firstMultiple = A;
        }

        if (B%K != 0){
            secondMultiple = B - B%K;
        }else{
            secondMultiple = B;
        }
           divisible = ((secondMultiple - firstMultiple)/K) + 1;

        return divisible;
    }
}
