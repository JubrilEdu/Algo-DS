package HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class StackAsQueue {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    public static void main(String[] args) {
        StackAsQueue stackAsQueue = new StackAsQueue();
        Scanner scanner = new Scanner(System.in);
        int numberOfIteration = scanner.nextInt();
        for (int i = 0; i < numberOfIteration ; i++) {
            int command = scanner.nextInt();
            if (command == 1){
                stackAsQueue.enqueue(scanner.nextInt());
            } else if (command == 2){
                stackAsQueue.dequeue();
            } else {
                System.out.println(stackAsQueue.mainStack.peek());
            }
        }

    }


    public void enqueue(int value){
        if (mainStack.empty()){
            mainStack.push(value);
        } if (!mainStack.isEmpty()){
              while (!mainStack.isEmpty()){
                  tempStack.push(mainStack.pop());
              }
              tempStack.push(value);
            } else if (!tempStack.isEmpty()){
            while (!tempStack.empty()){
                mainStack.push(tempStack.pop());
            }
            tempStack.isEmpty();
        }
        }

    public void dequeue(){
        if (!mainStack.empty()){
            mainStack.pop();
        } else if (!tempStack.isEmpty()){
            tempStack.pop();
        }
    }

    public void printTop(){
        if (!mainStack.empty()){
            System.out.println(mainStack.peek());
        } else if (!tempStack.isEmpty()){
            System.out.println(tempStack.peek());
        }
    }



}
