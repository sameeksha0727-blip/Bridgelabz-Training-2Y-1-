
package Queue.Leetcode;

import java.util.*;

public class Leetcode_1700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[] students = new int[n];
        int[] sandwiches = new int[n];

        System.out.println("Enter students (0 or 1):");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }

        System.out.println("Enter sandwiches (0 or 1):");
        for (int i = 0; i < n; i++) {
            sandwiches[i] = sc.nextInt();
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(students[i]);
        }

        int count = 0;
        int index = 0;

        while (!q.isEmpty() && count < q.size()) {

            if (q.peek() == sandwiches[index]) {
                q.poll();
                index++;
                count = 0;
            } else {
                q.add(q.poll());
                count++;
            }
        }

        System.out.println("Students unable to eat: " + q.size());
    }
}
