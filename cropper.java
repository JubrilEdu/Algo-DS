import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class cropper {
    public static void main(String[] args) {
//        System.out.println(cropper.solution("Codility We test coders",14));
        System.out.println(cropper.solution("00:01:07,400-234-090\n" +
                "   00:05:01,701-080-080\n" +
                "   00:05:00,400-234-090"));
    }

    public static String solution(String message, int K) {
        String[] input = message.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String string: input) {
            if ((stringBuilder.length() + string.length() > K)){
                break;
            } else {
                stringBuilder.append(string);
                stringBuilder.append(" ");
            }

        }

        return stringBuilder.toString().trim();
    }

    public static int solution(String S)  {
        String[] input = S.split("\n");
        HashMap<String, Integer> hashMap = new HashMap<>();
        int highestValue = 0;
        int amount = 0;
        String highestValueKey = "0";
        for (String string: input) {
            String key = string.substring(string.indexOf(",")+1);
            int value = convertToSeconds(string.substring(0,string.indexOf(",")));
            if (hashMap.containsKey(key)) {
                int initialValue = hashMap.get(key);
                int newValue = value + initialValue;
                hashMap.put(key,newValue);
                if (newValue > highestValue) {
                    highestValue = newValue;
                    highestValueKey = key;
                } else if (newValue == highestValue) {
                    highestValueKey = String.valueOf(Math.min(Integer.valueOf(highestValueKey.replace("-","")),
                            Integer.valueOf(key.replace("-",""))));
                }

            } else {
                hashMap.put(key,value);
                if (value> highestValue) {
                    highestValue = value;
                    highestValueKey = key;
                } else if (value == highestValue) {
                    highestValueKey = String.valueOf(Math.min(Integer.valueOf(highestValueKey.replace("-","")),
                            Integer.valueOf(key.replace("-",""))));
                }
            }
        }

        for (Map.Entry<String,Integer> entry: hashMap.entrySet()) {

            if (entry.getKey() == highestValueKey){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            } else if (entry.getValue() < 300) {
                amount = amount + (entry.getValue()*3);
            } else if (entry.getValue() > 300){
                int minuite = entry.getValue()/60;
                if (entry.getValue()%60 > 0) minuite++;
                amount = amount + (minuite*150);
            }
        }
        return amount;
    }

    public static int convertToSeconds(String value) {
        String timestampStr = value;
        String[] tokens = timestampStr.split(":");
        int minutes = Integer.parseInt(tokens[1]);
        int seconds = Integer.parseInt(tokens[2]);
        int duration =  60 * minutes + seconds;
        return duration;
    }
}
