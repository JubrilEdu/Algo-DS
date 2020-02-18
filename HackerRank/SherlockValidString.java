package HackerRank;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JB on 4/22/19.
 *
 * fails 1 testcase
 */
public class SherlockValidString {
    public static void main(String[] args) {
        SherlockValidString sherlockValidString = new SherlockValidString();
        System.out.println(sherlockValidString.isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd\n"));
    }


    static String isValid(String s) {
        Map map = new HashMap();
        s = s.replace("\n", "");
        System.out.println(s.contains("\n"));
        String[] listOfItem = s.split("");
        int checkNumber = 0;
        int failureCount = 0;
        HashMap<String,Integer>  hashMap = new HashMap<>();
        for (int i = 0; i < listOfItem.length; i++) {
            if (hashMap.containsKey(listOfItem[i])) {
                int initialValue = hashMap.get(listOfItem[i]);
                hashMap.replace(listOfItem[i],initialValue+1);
            } else {
                hashMap.put(listOfItem[i],1);
            }
        }

        for (Integer val: hashMap.values()) {
            if (checkNumber == 0) {
                checkNumber = val;
            } else {

                if(val > 1 && Math.abs((checkNumber - val)) > 0){
                    failureCount += Math.abs((checkNumber - val));
                }else if(val == 1 && Math.abs((checkNumber - val))> 0){
                    failureCount++;
                }
            }
        }

        if (failureCount>1){
            return "NO";
        }
        return "YES";
    }

//    static String isValidString(String s) {
//        HashMap
//    }
}
