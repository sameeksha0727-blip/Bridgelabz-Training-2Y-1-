package Stack.Leetcode;

import java.util.*;

public class Leetcode_155 {

    public static class MinStack {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int val) {
            stack.push(val);

            if (minStack.isEmpty() || val <= minStack.peek())
                minStack.push(val);
        }

        public void pop() {
            int val = stack.pop();

            if (val == minStack.peek())
                minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack ms = new MinStack();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();

            if (op == 1) {
                ms.push(sc.nextInt());
            } else if (op == 2) {
                ms.pop();
            } else if (op == 3) {
                System.out.println(ms.top());
            } else if (op == 4) {
                System.out.println(ms.getMin());
            }
        }
    }
}