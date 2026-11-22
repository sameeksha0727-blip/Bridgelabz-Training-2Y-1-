package Stack.Leetcode;

import java.util.*;

public class Leetcode_682 {

    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("+")) {
                int a = st.pop();
                int b = st.pop();

                st.push(b);
                st.push(a);
                st.push(a + b);
            }
            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (op.equals("C")) {
                st.pop();
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] operations = new String[n];

        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }

        System.out.println(calPoints(operations));
    }
}
