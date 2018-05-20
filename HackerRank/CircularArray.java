package HackerRank;

/**
 * Created by Jubril on 3/7/18.
 */
public class CircularArray {
    public static void main(String[] args) {

    }

    public int[] circularArrayRotation(int[] a, int[] m,int K) {
        int[] p = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            p[(i+K)%a.length] = a[i];
        }
        for (int j = 0; j<m.length;j++){
            System.out.print(p[m[j]]);
        }
        return p;
    }
}
