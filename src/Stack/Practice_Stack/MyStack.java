package Stack.Practice_Stack;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.pop();   // to remove the element at the front
        int ele = stack.peek();
        System.out.println("Stack :: ");
        System.out.println(stack);
        System.out.println("Element at the top of the " + ele);
        stack.search(3);
        System.out.println();

    }
}
