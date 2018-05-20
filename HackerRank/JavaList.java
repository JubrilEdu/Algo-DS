package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jubril on 5/13/18.
 */
public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIteration = scanner.nextInt();
        JavaList javaList = new JavaList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfIteration; i++) {
            int input = scanner.nextInt();
            arrayList.add(input);
        }
        int numberOfInstruction = scanner.nextInt();
        for (int i = 0; i < numberOfInstruction; i++) {
            String instruction = scanner.next();
            if (instruction.equalsIgnoreCase("insert")){
                javaList.insert(scanner.nextInt(),scanner.nextInt(),arrayList);
            }else if(instruction.equalsIgnoreCase("delete")){
                javaList.delete(scanner.nextInt(),arrayList);
            }

        }

        for (int val: arrayList){
            System.out.print(val+" ");
        }
    }

    public void delete(int index, ArrayList arrayList){
        arrayList.remove(index);
    }

    public void insert(int index,int value,ArrayList arrayList){
        arrayList.add(index,value);
    }
}
