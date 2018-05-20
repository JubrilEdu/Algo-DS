package HackerRank;

/**
 * Created by Jubril on 3/24/18.
 */
public class GradingStudent {
    public static void main(String[] args) {
        GradingStudent gradingStudent = new GradingStudent();
        int[] A = {73,67,38, 33};
        System.out.println(gradingStudent.grade(A));
        for (int i = 0; i < gradingStudent.grade(A).length; i++) {
            System.out.println(gradingStudent.grade(A)[i]);
        }
    }

    public int[] grade(int[] A){
        for (int i = 0; i < A.length ; i++) {
            if (A[i]>=38 && A[i]%5>=3){
                A[i] = A[i]+ (5-(A[i]%5));
            }
        }

        return A;
    }
}
