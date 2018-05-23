package HackerRank;

import java.util.Scanner;

/**
 * Created by Jubril on 5/21/18.
 */
public class JavaException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int x=0,y = 0;
        try {
             x = scanner.nextInt();
             y = scanner.nextInt();
            try {
                result = x/y;
                System.out.println(result);
            }catch (Exception e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println(e.getClass().getName());
        }



    }
}
