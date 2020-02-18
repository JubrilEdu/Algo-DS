package HackerRank;


import java.math.BigInteger;
import java.util.*;

public class CryptoPanagrams {
    HashSet<BigInteger> arrayList = new HashSet<BigInteger>();

    public static void main(String[] args) {
        CryptoPanagrams crytCryptoPanagrams = new CryptoPanagrams();
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int maxPrimeValue = scanner.nextInt();
            int iteration = scanner.nextInt();
            for (int j = 0; j < iteration; j = j+2) {
                crytCryptoPanagrams.gett(scanner.nextBigInteger(),scanner.nextBigInteger(),maxPrimeValue);
            }
        }
//        for(BigInteger str:crytCryptoPanagrams.arrayList){
//            System.out.println(str);
//        }
        System.out.println(crytCryptoPanagrams.arrayList.size());

        List<BigInteger> sortedList = new ArrayList<>(crytCryptoPanagrams.arrayList);
        Collections.sort(sortedList);
//        for (int i = 0; i < sortedList.size(); i++) {
//            System.out.print(sortedList.get(i));
//        }

        char[] alphabets = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'};


    }

    public void gett(BigInteger a, BigInteger b, int c) {
            if (a.gcd(b).intValue() > 0 && a.gcd(b).intValue()  < c ) {
                BigInteger value = a.gcd(b);
                if (a.divide(value).compareTo(BigInteger.valueOf(1)) == 1 &&  a.divide(value).isProbablePrime(1)){
                    arrayList.add(a.divide(value));
                }

                if (b.divide(value).compareTo(BigInteger.valueOf(1)) ==1 &&  b.divide(value).isProbablePrime(1)){
                    arrayList.add(value);
                }

                if (b.divide(value).compareTo(BigInteger.valueOf(1)) ==1 &&  b.divide(value).isProbablePrime(1)) {
                    arrayList.add(b.divide(value));
                }
            }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


}
