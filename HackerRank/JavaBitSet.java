package HackerRank;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by JB on 10/7/18.
 */
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfBitSet = scanner.nextInt();
        int numberOfOperations = scanner.nextInt();
        BitSet bitSetOne = new BitSet(sizeOfBitSet);
        BitSet bitSetTwo = new BitSet(sizeOfBitSet);

        for (int i = 0; i < numberOfOperations ; i++) {
            String instruction = scanner.next();
            int firstInput = scanner.nextInt();
            int secondInput = scanner.nextInt();
            if (instruction.equalsIgnoreCase("and")){
                if (firstInput == 1){
                    bitSetOne.and(bitSetTwo);
                } else {
                    bitSetTwo.and(bitSetOne);
                }
            } else if (instruction.equalsIgnoreCase("set")){
                if (firstInput == 1){
                    bitSetOne.set(secondInput);
                } else {
                    bitSetTwo.set(secondInput);
                }
            } else if (instruction.equalsIgnoreCase("or")){
                if (firstInput == 1){
                    bitSetOne.or(bitSetTwo);
                } else {
                    bitSetTwo.or(bitSetOne);
                }
            } else if (instruction.equalsIgnoreCase("flip")){
                if (firstInput == 1){
                    bitSetOne.flip(secondInput);
                } else {
                    bitSetTwo.flip(secondInput);
                }
            } else if (instruction.equalsIgnoreCase("xor")){
                if (firstInput == 1){
                    bitSetOne.xor(bitSetTwo);
                } else {
                    bitSetTwo.xor(bitSetOne);
                }
            }
            System.out.println(bitSetOne.cardinality()+" "+bitSetTwo.cardinality());
        }
    }
}
