package Stack.Leetcode;

import java.util.*;

public class Leetcode_1021 {

    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (!st.isEmpty())
                    result += ch;

                st.push(ch);
            }
            else {
                st.pop();

                if (!st.isEmpty())
                    result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(removeOuterParentheses(s));
    }
}
