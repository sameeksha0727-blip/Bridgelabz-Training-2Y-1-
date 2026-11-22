package Stack.Leetcode;

import java.util.*;

public class Leetcode_844 {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st1.isEmpty())
                    st1.pop();
            } else {
                st1.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!st2.isEmpty())
                    st2.pop();
            } else {
                st2.push(ch);
            }
        }

        return st1.equals(st2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(backspaceCompare(s, t));
    }
}
