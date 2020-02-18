package LeetCode;

/**
 * Created by Jubril on 9/4/18.
 */
public class AddBinary {

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("11","1"));

    }

    public String addBinary(String valueOne, String valueTwo){
        StringBuilder answer= new StringBuilder();
        boolean carry = false;
        int valueOneCount = valueOne.length() - 1;
        int valueTwoCount = valueTwo.length() -1;

        while (valueOneCount >= 0 || valueTwoCount >= 0 || carry){
            char aChar = valueOneCount >= 0 ? valueOne.charAt(valueOneCount) : '0';
            char bChar = valueTwoCount >= 0 ? valueTwo.charAt(valueTwoCount) : '0';

            if (aChar == '1' && bChar == '1') {
                if (carry){
                    answer.append("1");
                } else {
                    answer.append("0");
                }
                carry = true;

            }else if (aChar == '1' || bChar == '1'){
                if (carry){
                    answer.append("0");
                    carry = true;
                } else {
                    answer.append("1");
                }

            }else {

                if (carry){
                    answer.append("1");
                    carry = false;
                } else {
                    answer.append("0");
                }

            }

            valueOneCount--;
            valueTwoCount--;

        }
        return answer.reverse().toString();
    }
}
