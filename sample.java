import java.util.ArrayList;
import java.util.Scanner;

public class sample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int input  = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        arrayList2.add(input);
        for (int i = 0; i< input; i++){
            int newInput = scanner.nextInt();
            if (newInput < min){
                min = newInput;
            }
            arrayList.add(newInput);
        }

        for (int i = 0; i < arrayList.size(); i++) {

        }

        while (arrayList.size()>1){
            for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) == min){
                        arrayList.remove(min);
                    } else {
                        int previous = arrayList.get(i);
                        arrayList.set(i,previous-min);
                        if (arrayList.get(i) < min){
                            min = arrayList.get(i);
                        }
                    }

            }
                        arrayList2.add(arrayList.size());
        }

        for (int i = 0; i < arrayList2.size() ; i++) {
            System.out.println(arrayList2.get(i));
        }

    }
}
