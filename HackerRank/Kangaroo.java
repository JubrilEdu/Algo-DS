package HackerRank;

/**
 * Created by Jubril on 3/24/18.
 */
public class Kangaroo {
    public static void main(String[] args) {
        Kangaroo kangaroo = new Kangaroo();
        System.out.println(kangaroo.Kangaroo(0,3,4,2));
        System.out.println(findGCD(3,2));
    }

    public String Kangaroo(int x1, int v1, int x2, int v2){
        int gcd = findGCD(v1,v2);
        if (gcd < v1 || gcd < v2){
            return "NO";
        }else {
            return "YES";
        }
    }

    private static int findGCD(int number1, int number2) {
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
}
