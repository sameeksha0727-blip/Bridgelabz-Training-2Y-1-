package Stack.Leetcode;

import java.util.*;

public class Leetcode_739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days:");
        int n = sc.nextInt();

        int[] temperatures = new int[n];

        System.out.println("Enter temperatures:");
        for (int i = 0; i < n; i++) {
            temperatures[i] = sc.nextInt();
        }

        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&
                    temperatures[i] > temperatures[st.peek()]) {

                int prevIndex = st.pop();
                result[prevIndex] = i - prevIndex;
            }

            st.push(i);
        }

        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

    }
}


