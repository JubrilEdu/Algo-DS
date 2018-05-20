package HackerRank;

import java.util.Scanner;

/**
 * Created by Jubril on 4/7/18.
 */
public class SavingTheUniverse {
    // search for the the nearest S and swap with the nearest charge, the check if damage id stil the same
    // keep track of damage and energy

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] instruct = scanner.next().split("");
        System.out.println();
//         int numberOfIteration = scanner.nextInt();
//        for (int i = 0; i< numberOfIteration; i++){
//            int Damage = scanner.nextInt();
//            String instruction = scanner.next();
//        }
    }


    public String foilAttack(int caseNum,int damage,String instruction){
        String[] instruct = instruction.split("");
        int initialPower = 1;
        int massDamage = 0;
        for (int i = 1; i < instruct.length; i++) {
            if (instruct[i].equalsIgnoreCase("C")){
                initialPower = initialPower * 2;
            }else if (instruct[i].equalsIgnoreCase("S")){
                massDamage = massDamage + initialPower;
            }


        }
        System.out.println(massDamage);





        return "";
    }


}
