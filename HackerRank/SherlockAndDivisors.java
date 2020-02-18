package HackerRank;

/**
 * Created by JB on 10/17/18.
 */
public class SherlockAndDivisors {

    public static void main(String[] args) {
        System.out.println(SherlockAndDivisors.divisors(8));
    }

    static int divisors(int n) {
        int numberOfEvenDivisors = 0;
        for (int i =1; i<= Math.sqrt(n);i++){
            if (n%i == 0) {
                if (i%2 == 0){
                    numberOfEvenDivisors++;
                }
                if ((n/i)!= i && (n/i)%2==0){
                    numberOfEvenDivisors++;
                }
            }
        }
       return numberOfEvenDivisors;
    }
}
