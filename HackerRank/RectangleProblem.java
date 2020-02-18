package HackerRank;

import java.util.Stack;

public class RectangleProblem {


    public static void main(String[] args) {
        RectangleProblem rectangleProblem = new RectangleProblem();
        System.out.println(rectangleProblem.largestRectangleArea(new int[]{1,2,3,4,5}));

    }

    public int largestRectangleArea(int[] hist){
      int maxArea = 0;
// o(n^2) solution
//        for (int i = 0; i < hist.length ; i++) {
//            int h = hist[i];
//
//            maxArea = Math.max(maxArea, h);
//
//            for (int j = i - 1; j >= 0; --j) {
//                final int w = (i - j + 1);
//                h = Math.min(h, hist[j]);
//
//                System.out.println( i +" "+j+ " "+" "+w+ " " +h*w);
//                maxArea = Math.max(maxArea, h * w);
//            }
//
//        }

        final Stack<Integer> stack = new Stack<>();
        int top = 0;
        int mostRecentArea = 0;
        int counter = 0;

        while (counter < hist.length){
            if (stack.empty() || hist[stack.peek()] <= hist[counter]){
                stack.push(counter++);
            } else {
             top = stack.pop();
             int width = stack.empty()? counter : counter - stack.peek() -1 ;
             mostRecentArea = hist[top] * width;

             if (maxArea < mostRecentArea){
                 maxArea = mostRecentArea;
             }
            }
        }

        while (!stack.empty()){
            top = stack.pop();
            int width = stack.empty()? counter : counter - stack.peek() -1 ;
            mostRecentArea = hist[top] * width;

            if (maxArea < mostRecentArea){
                maxArea = mostRecentArea;
            }

        }


        return maxArea;
    }
}
