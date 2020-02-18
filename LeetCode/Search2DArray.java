package LeetCode;

public class Search2DArray {
    
    public static void main(String[] args) {
        
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        int left = 0;
        int right = row*column -1;

        while (left < right) {
            int midpoint = left + ((right - left)/2);
            int midpointElement = matrix[midpoint/column][midpoint%column];
            if (target == midpointElement) {
                return true;
            } else  if (midpointElement >  target){
                 right = midpoint-1;
            } else if (midpointElement < target){
                left = midpoint + 1;
            }
        }
        return false;
    }
}
