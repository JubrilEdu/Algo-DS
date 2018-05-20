package HackerRank;

/**
 * Created by Jubril on 3/23/18.
 */
public class TimeConversion {
    public static void main(String[] args) {
        TimeConversion timeConversion = new TimeConversion();
        System.out.println(timeConversion.newFormat("12:45:54AM"));
    }

    public String newFormat(String  S){
        String[] A = S.split(":");
        if (A[2].contains("PM")){
            if (!A[0].contentEquals("12")){
                A[0] = String.valueOf(Integer.valueOf(A[0])+12);
            }
            A[2] = A[2].replace("PM","");
            return A[0]+":"+A[1]+":"+A[2];
        }
        A[2] = A[2].replace("AM","");
        if (A[0].contentEquals("12")) A[0] = "00";
        return  A[0]+":"+A[1]+":"+A[2];
    }
}
