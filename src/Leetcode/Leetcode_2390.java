package Stack.Leetcode;

import java.util.*;

public class Leetcode_2390 {

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        String result = "";

        while (!st.isEmpty()) {
            result = st.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(removeStars(s));
    }
}
