package Codility;

/**
 * Created by Jubril on 3/8/18.
 */
public class GenomicRangeQuery {
    public static void main(String[]args){
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] resd = genomicRangeQuery.solution("GGGGGGGGGGGGGGGGG",P,Q);

        for (int result:resd) {
            System.out.println(result);
        }
    }

    public int[] solution(String S,int[] P,int[] Q){
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            String test = "";
            if (P[i] == Q[i]){
                test = String.valueOf(S.charAt(P[i]));
            }else{
                test = S.substring(P[i],Q[i]);
            }
            if (test.contains("A")){
                result[i] = 1;
                continue;
            }else if (test.contains("C")){
                result[i] = 2;
                continue;
            }else if (test.contains("G")){
                result[i] = 3;
                continue;
            }else if (test.contains("T")){
                result[i] = 4;
                continue;
            }
        }

        return  result;
    }
}
