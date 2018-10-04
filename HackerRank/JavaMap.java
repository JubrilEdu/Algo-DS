package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Jubril on 5/13/18.
 */
public class JavaMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        int numberOfIteration = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfIteration; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            hashMap.put(name,phone);
            scanner.nextLine();

        }
        int counter = 0;
        while (counter < hashMap.size()){
            String input = scanner.nextLine();
            if (hashMap.containsKey(input)){
                System.out.println(input+"="+hashMap.get(input));
            } else {
                System.out.println("Not found");
            }
            counter++;
        }


    }


}
