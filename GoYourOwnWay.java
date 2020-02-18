import java.util.Scanner;

/**
 * Created by JB on 4/6/19.
 */
public class GoYourOwnWay {

    public static void main(String[] args) {
        GoYourOwnWay goYourOwnWay =  new GoYourOwnWay();
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for (int i = 0; i < value ; i++) {
            goYourOwnWay.findWay(scanner.next(),i+1);
        }
    }

    public void findWay(String n, int trial){
        char[] result = n.toCharArray();
        for(int i = 0; i < result.length; i++){
            if(result [i] == 'S'){
                result[i] = 'E';
            } else {
                result[i] = 'S';
            }
        }
        System.out.println("Case #"+trial+": "+  String.valueOf(result));
    }
}


